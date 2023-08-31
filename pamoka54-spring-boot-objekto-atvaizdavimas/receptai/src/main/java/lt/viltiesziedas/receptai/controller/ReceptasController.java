package lt.viltiesziedas.receptai.controller;

import lt.viltiesziedas.receptai.model.entity.Receptas;
import lt.viltiesziedas.receptai.model.repository.ReceptasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReceptasController {

    @Autowired
    ReceptasRepository receptasRepository;

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

}
