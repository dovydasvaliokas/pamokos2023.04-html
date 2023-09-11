package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ingredientas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;
    @Column(length = 1024)
    private String aprasymas;
    private double kaina;
    private int kalorijosPer100g;

    @ManyToMany
    @JoinTable(
        name = "recepto_ingredientai",
        joinColumns = @JoinColumn(name = "ingrediento_id"),
        inverseJoinColumns = @JoinColumn(name = "recepto_id")
    )
    private Set<Receptas> receptai;

    public Ingredientas() {
    }

    public Ingredientas(long id, String pavadinimas, String aprasymas, double kaina, int kalorijosPer100g, Set<Receptas> receptai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.kalorijosPer100g = kalorijosPer100g;
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

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getKalorijosPer100g() {
        return kalorijosPer100g;
    }

    public void setKalorijosPer100g(int kalorijosPer100g) {
        this.kalorijosPer100g = kalorijosPer100g;
    }

    public Set<Receptas> getReceptai() {
        return receptai;
    }

    public void setReceptai(Set<Receptas> receptai) {
        this.receptai = receptai;
    }

    @Override
    public String toString() {
        return "Ingredientas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", kaina=" + kaina +
                ", kalorijosPer100g=" + kalorijosPer100g +
                ", receptai=" + receptai +
                '}';
    }
}
