package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class ReceptoKategorija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;

    @OneToMany(mappedBy = "kategorija")
    private Set<Receptas> receptai;

    public ReceptoKategorija() {
    }

    public ReceptoKategorija(long id, String pavadinimas, Set<Receptas> receptai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.receptai = receptai;
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

    public Set<Receptas> getReceptai() {
        return receptai;
    }

    public void setReceptai(Set<Receptas> receptai) {
        this.receptai = receptai;
    }

    @Override
    public String toString() {
        return "ReceptoKategorija{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", receptai=" + receptai +
                '}';
    }
}
