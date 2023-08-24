package lt.viltiesziedas.receptai.model.sampledata;

import lt.viltiesziedas.receptai.model.entity.Receptas;
import lt.viltiesziedas.receptai.model.entity.ReceptoKategorija;
import lt.viltiesziedas.receptai.model.repository.ReceptasRepository;
import lt.viltiesziedas.receptai.model.repository.ReceptoKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DuomenuUzpildymas implements ApplicationListener<ContextRefreshedEvent> {
    boolean arJauYra = true;

    @Autowired
    ReceptoKategorijaRepository receptoKategorijaRepository;

    @Autowired
    ReceptasRepository receptasRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (!arJauYra) {
            sukurtiKategorijas();
            sukurtiReceptus();
        }
    }

    public void sukurtiKategorijas() {
        ReceptoKategorija kategorija1 = new ReceptoKategorija();
        kategorija1.setPavadinimas("Azijiečių");
        ReceptoKategorija kategorija2 = new ReceptoKategorija();
        kategorija2.setPavadinimas("Vegetariški");
        ReceptoKategorija kategorija3 = new ReceptoKategorija();
        kategorija3.setPavadinimas("Lietuviški");
        ReceptoKategorija kategorija4 = new ReceptoKategorija();
        kategorija4.setPavadinimas("Grilius");

        receptoKategorijaRepository.save(kategorija1);
        receptoKategorijaRepository.save(kategorija2);
        receptoKategorijaRepository.save(kategorija3);
        receptoKategorijaRepository.save(kategorija4);
    }

    public void sukurtiReceptus() {
        Receptas receptas1 = new Receptas();
        receptas1.setPavadinimas("Vištiena su ryžiais");
        receptas1.setAprasymas("Azijietišika vištiena su ryžiais ir padašu ir t.t.");
        receptas1.setKaina(7.98);
        receptas1.setKalorijosPer100g(59);
        ReceptoKategorija kategorija1 = new ReceptoKategorija();
        kategorija1.setId(1);
        receptas1.setKategorija(kategorija1);

        Receptas receptas2 = new Receptas();
        receptas2.setPavadinimas("Cepelinai");
        receptas2.setAprasymas("Lietuvos nacionalinisp patiekalas iš bulvių");
        receptas2.setKaina(5.99);
        receptas2.setKalorijosPer100g(98);
        ReceptoKategorija kategorija2 = new ReceptoKategorija();
        kategorija2.setId(3);
        receptas2.setKategorija(kategorija2);

        receptasRepository.save(receptas1);
        receptasRepository.save(receptas2);
    }
}
