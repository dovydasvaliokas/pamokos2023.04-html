package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredientas {
    @Id
    long id;
    String pavadinimas;
    String aprasymas;
    double kaina;
    int kalorijosPer100g;
}
