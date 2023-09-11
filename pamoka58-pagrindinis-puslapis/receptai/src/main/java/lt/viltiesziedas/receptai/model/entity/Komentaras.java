package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Komentaras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 512)
    private String tekstas;

    // Datos nebūtina daryti, jei nenorite
    private Date pridejimoData;

    @ManyToOne
    @JoinColumn(name = "recepto_id")
    private Receptas receptas;

    @ManyToOne
    @JoinColumn(name = "vartotojo_id")
    private Vartotojas vartotojas;

    public Komentaras() {
    }

    public Komentaras(long id, String tekstas, Date pridejimoData, Receptas receptas, Vartotojas vartotojas) {
        this.id = id;
        this.tekstas = tekstas;
        this.pridejimoData = pridejimoData;
        this.receptas = receptas;
        this.vartotojas = vartotojas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTekstas() {
        return tekstas;
    }

    public void setTekstas(String tekstas) {
        this.tekstas = tekstas;
    }

    public Date getPridejimoData() {
        return pridejimoData;
    }

    public void setPridejimoData(Date pridejimoData) {
        this.pridejimoData = pridejimoData;
    }

    public Receptas getReceptas() {
        return receptas;
    }

    public void setReceptas(Receptas receptas) {
        this.receptas = receptas;
    }

    public Vartotojas getVartotojas() {
        return vartotojas;
    }

    public void setVartotojas(Vartotojas vartotojas) {
        this.vartotojas = vartotojas;
    }

    @Override
    public String toString() {
        return "Komentaras{" +
                "id=" + id +
                ", tekstas='" + tekstas + '\'' +
                ", pridejimoData=" + pridejimoData +
                '}';
    }
}
