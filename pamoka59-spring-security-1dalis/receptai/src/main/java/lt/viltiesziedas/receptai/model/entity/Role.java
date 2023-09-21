package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;

    @ManyToMany(mappedBy = "roles")
    private Set<Vartotojas> vartotojai;

    @ManyToMany
    @JoinTable (
            name = "roles_privilegijos",
            joinColumns = @JoinColumn (name = "roles_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn (name = "privilegijos_id", referencedColumnName = "id")
    )
    private Set<Privilegija> privilegijos;

    public Role() {
    }

    public Role(long id, String pavadinimas, Set<Vartotojas> vartotojai, Set<Privilegija> privilegijos) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.vartotojai = vartotojai;
        this.privilegijos = privilegijos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Set<Vartotojas> getVartotojai() {
        return vartotojai;
    }

    public void setVartotojai(Set<Vartotojas> vartotojai) {
        this.vartotojai = vartotojai;
    }

    public Set<Privilegija> getPrivilegijos() {
        return privilegijos;
    }

    public void setPrivilegijos(Set<Privilegija> privilegijos) {
        this.privilegijos = privilegijos;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                '}';
    }
}
