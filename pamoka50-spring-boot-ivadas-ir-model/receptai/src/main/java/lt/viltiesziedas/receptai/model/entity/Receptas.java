package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Receptas {
    @Id
    long id;
    String pavadinimas;
    String aprasymas;
    double kaina;
    int kalorijosPer100g;

    @ManyToOne
    ReceptoKategorija kategorija;
}
