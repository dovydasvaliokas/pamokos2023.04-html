package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vartotojas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "vartotojas")
    private Set<Komentaras> komentarai;

    public Vartotojas() {
    }

    public Vartotojas(long id, String username, String password, Set<Komentaras> komentarai) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.komentarai = komentarai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Komentaras> getKomentarai() {
        return komentarai;
    }

    public void setKomentarai(Set<Komentaras> komentarai) {
        this.komentarai = komentarai;
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", komentarai=" + komentarai +
                '}';
    }
}
