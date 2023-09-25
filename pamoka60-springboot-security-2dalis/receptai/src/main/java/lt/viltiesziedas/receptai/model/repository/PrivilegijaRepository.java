package lt.viltiesziedas.receptai.model.repository;

import lt.viltiesziedas.receptai.model.entity.Privilegija;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegijaRepository extends JpaRepository<Privilegija, Long> {
    Privilegija findByPavadinimas(String pavadinimas);
}
