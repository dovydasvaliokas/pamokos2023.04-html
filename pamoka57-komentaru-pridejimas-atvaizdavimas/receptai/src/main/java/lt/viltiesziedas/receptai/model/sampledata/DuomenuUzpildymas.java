package lt.viltiesziedas.receptai.model.sampledata;

import lt.viltiesziedas.receptai.model.entity.Komentaras;
import lt.viltiesziedas.receptai.model.entity.Receptas;
import lt.viltiesziedas.receptai.model.entity.ReceptoKategorija;
import lt.viltiesziedas.receptai.model.entity.Vartotojas;
import lt.viltiesziedas.receptai.model.repository.KomentarasRepository;
import lt.viltiesziedas.receptai.model.repository.ReceptasRepository;
import lt.viltiesziedas.receptai.model.repository.ReceptoKategorijaRepository;
import lt.viltiesziedas.receptai.model.repository.VartotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DuomenuUzpildymas implements ApplicationListener<ContextRefreshedEvent> {
    boolean arJauYra = true;

    @Autowired
    ReceptoKategorijaRepository receptoKategorijaRepository;

    @Autowired
    ReceptasRepository receptasRepository;

    @Autowired
    VartotojasRepository vartotojasRepository;

    @Autowired
    KomentarasRepository komentarasRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (!arJauYra) {
            sukurtiKategorijas();
            sukurtiReceptus();
            sukurtiVartotojus();
            sukurtiKomentarus();
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

        Receptas receptas3 = new Receptas();
        receptas3.setPavadinimas("Vištiena su daržovėmis");
        receptas3.setAprasymas("Azijietišika vištiena su daržovėmis");
        receptas3.setKaina(7.98);
        receptas3.setKalorijosPer100g(59);
        ReceptoKategorija kategorija3 = new ReceptoKategorija();
        kategorija3.setId(1);
        receptas3.setKategorija(kategorija3);

        receptasRepository.save(receptas1);
        receptasRepository.save(receptas2);
        receptasRepository.save(receptas3);
    }

    public void sukurtiVartotojus() {
        Vartotojas vartotojas1 = new Vartotojas();
        vartotojas1.setUsername("antanas1");
        vartotojas1.setPassword("namas123");

        Vartotojas vartotojas2 = new Vartotojas();
        vartotojas2.setUsername("kirpykla321");
        vartotojas2.setPassword("zirkles258");

        vartotojasRepository.save(vartotojas1);
        vartotojasRepository.save(vartotojas2);
    }

    public void sukurtiKomentarus() {
        Komentaras komentaras1 = new Komentaras();
        komentaras1.setTekstas("Labai patiko.");
        komentaras1.setPridejimoData(new Date());
        Receptas receptas1 = new Receptas();
        receptas1.setId(1);
        komentaras1.setReceptas(receptas1);
        Vartotojas vartotojas1 = new Vartotojas();
        vartotojas1.setId(1);
        komentaras1.setVartotojas(vartotojas1);

        Komentaras komentaras2 = new Komentaras();
        komentaras2.setTekstas("Prastas receptas.");
        komentaras2.setPridejimoData(new Date());
        Receptas receptas2 = new Receptas();
        receptas2.setId(1);
        komentaras2.setReceptas(receptas2);
        Vartotojas vartotojas2 = new Vartotojas();
        vartotojas2.setId(2);
        komentaras2.setVartotojas(vartotojas2);

        komentarasRepository.save(komentaras1);
        komentarasRepository.save(komentaras2);
    }
}
