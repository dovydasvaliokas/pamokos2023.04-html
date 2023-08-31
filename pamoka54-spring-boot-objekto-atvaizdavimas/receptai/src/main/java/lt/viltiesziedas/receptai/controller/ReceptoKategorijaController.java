package lt.viltiesziedas.receptai.controller;

import lt.viltiesziedas.receptai.model.entity.ReceptoKategorija;
import lt.viltiesziedas.receptai.model.repository.ReceptoKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ReceptoKategorijaController {

    @Autowired
    ReceptoKategorijaRepository receptoKategorijaRepository;

    @GetMapping("/kategorijos/gauti-visos")
    public String gautiVisasKategorijas(Model model) {
        List<ReceptoKategorija> visosKategorijos = receptoKategorijaRepository.findAll();
        model.addAttribute("visosKategorijos", visosKategorijos);
        return "kategorija/visos-kategorijos.html";
    }

    @GetMapping("/kategorijos/visi-receptai/{id}")
    public String kategorijosReceptai(Model model, @PathVariable long id) {
        ReceptoKategorija kategorija = receptoKategorijaRepository.findById(id);
        model.addAttribute("kategorija", kategorija);
        return "kategorija/visi-receptai.html";
    }
}
