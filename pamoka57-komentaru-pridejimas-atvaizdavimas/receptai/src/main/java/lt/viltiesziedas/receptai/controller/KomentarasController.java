package lt.viltiesziedas.receptai.controller;

import lt.viltiesziedas.receptai.model.entity.Komentaras;
import lt.viltiesziedas.receptai.model.entity.Receptas;
import lt.viltiesziedas.receptai.model.entity.Vartotojas;
import lt.viltiesziedas.receptai.model.repository.KomentarasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class KomentarasController {

    @Autowired
    KomentarasRepository komentarasRepository;

    @PostMapping("/komentaras/prideti/{id}")
    public String pridetiKomentara(Model model, @PathVariable long id, @RequestParam String pridedamasKomentaras) {
        Komentaras komentaras = new Komentaras();
        komentaras.setTekstas(pridedamasKomentaras);
        komentaras.setPridejimoData(new Date());
        Receptas receptas = new Receptas();
        receptas.setId(id);
        komentaras.setReceptas(receptas);
        Vartotojas vartotojas = new Vartotojas();
        vartotojas.setId(1);
        komentaras.setVartotojas(vartotojas);

        komentarasRepository.save(komentaras);
        return "komentaras/pridetas.html";
    }
}
