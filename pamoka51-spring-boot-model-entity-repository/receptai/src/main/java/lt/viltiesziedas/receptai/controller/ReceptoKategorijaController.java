package lt.viltiesziedas.receptai.controller;

import lt.viltiesziedas.receptai.model.entity.ReceptoKategorija;
import lt.viltiesziedas.receptai.model.repository.ReceptoKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReceptoKategorijaController {
    @Autowired
    ReceptoKategorijaRepository receptoKategorijaRepository;

    @GetMapping("/kategorijos/gauti-visos")
    public String gautiVisasKategorijas() {
        List<ReceptoKategorija> visosKategorijos = receptoKategorijaRepository.findAll();
        return "belekas";
    }
}
