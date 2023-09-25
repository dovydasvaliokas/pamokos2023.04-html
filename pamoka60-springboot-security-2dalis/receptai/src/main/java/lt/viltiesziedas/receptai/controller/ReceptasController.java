package lt.viltiesziedas.receptai.controller;

import lt.viltiesziedas.receptai.model.entity.Receptas;
import lt.viltiesziedas.receptai.model.entity.ReceptoKategorija;
import lt.viltiesziedas.receptai.model.repository.ReceptasRepository;
import lt.viltiesziedas.receptai.model.repository.ReceptoKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReceptasController {

    @Autowired
    ReceptasRepository receptasRepository;

    @Autowired
    ReceptoKategorijaRepository kategorijaRepository;

    @GetMapping("/receptai/paieska")
    public String receptuPaieska(Model model, @RequestParam(required = false) String pavadinimas) {
        List<Receptas> visiReceptai;
        if (StringUtils.isEmpty(pavadinimas)) {
            visiReceptai = receptasRepository.findAll();
        } else {
            visiReceptai = receptasRepository.findByPavadinimasLike("%" + pavadinimas + "%");
        }
        model.addAttribute("visiReceptai", visiReceptai);
        return "receptai/paieska.html";
    }

    @GetMapping("/receptai/informacija/{id}")
    public String receptoInformacija(Model model, @PathVariable long id) {
        Receptas receptas = receptasRepository.findById(id);
        model.addAttribute("receptas", receptas);
        return "receptai/informacija.html";
    }

    @PostMapping("/receptas/istrinti/{id}")
    public String istrintiRecepta(Model model, @PathVariable long id) {
        receptasRepository.deleteById(id);
        return "receptai/istrintas.html";
    }

    @GetMapping("/receptas/pridejimas")
    public String receptoIdejimas(Model model) {
        model.addAttribute("receptas", new Receptas());
        List<ReceptoKategorija> kategorijos = kategorijaRepository.findAll();
        model.addAttribute("kategorijos", kategorijos);
        return "receptai/pridejimas.html";
    }

    @PostMapping("/receptai/pridetas")
    public String receptasIdetas(Model model, @ModelAttribute Receptas receptas) {
        receptasRepository.save(receptas);
        return "receptai/pridetas.html";
    }

    @GetMapping("/receptai/redagavimas/{id}")
    public String receptoRedagavimas(Model model, @PathVariable long id) {
        Receptas receptas = receptasRepository.findById(id);
        model.addAttribute("receptas", receptas);
        List<ReceptoKategorija> kategorijos = kategorijaRepository.findAll();
        model.addAttribute("kategorijos", kategorijos);
        return "receptai/redagavimas.html";
    }

}
