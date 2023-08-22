package lt.viltiesziedas.receptai.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class ReceptoKategorija {
    @Id
    long id;
    String pavadinimas;

    @OneToMany
    ArrayList<Receptas> kategorijosReceptai;
}
