package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Receptas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pavadinimas;
    @Column(length = 1024)
    private String aprasymas;
    private double kaina;
    private int kalorijosPer100g;

    @ManyToOne
    @JoinColumn(name = "kategorijos_id")
    private ReceptoKategorija kategorija;

    @ManyToMany
    @JoinTable(
        name = "recepto_ingredientai",
        joinColumns = @JoinColumn(name = "recepto_id"),
        inverseJoinColumns = @JoinColumn(name = "ingrediento_id")
    )
    private Set<Ingredientas> ingredientai;

    @OneToMany(mappedBy = "receptas")
    private Set<Komentaras> komentarai;

    public Receptas() {
    }

    public Receptas(long id, String pavadinimas, String aprasymas, double kaina, int kalorijosPer100g, ReceptoKategorija kategorija, Set<Ingredientas> ingredientai, Set<Komentaras> komentarai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.kalorijosPer100g = kalorijosPer100g;
        this.kategorija = kategorija;
        this.ingredientai = ingredientai;
        this.komentarai = komentarai;
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

    public ReceptoKategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(ReceptoKategorija kategorija) {
        this.kategorija = kategorija;
    }

    public Set<Ingredientas> getIngredientai() {
        return ingredientai;
    }

    public void setIngredientai(Set<Ingredientas> ingredientai) {
        this.ingredientai = ingredientai;
    }

    public Set<Komentaras> getKomentarai() {
        return komentarai;
    }

    public void setKomentarai(Set<Komentaras> komentarai) {
        this.komentarai = komentarai;
    }

    @Override
    public String toString() {
        return "Receptas{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", kaina=" + kaina +
                ", kalorijosPer100g=" + kalorijosPer100g +
                '}';
    }
}
