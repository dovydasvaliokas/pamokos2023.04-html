package lt.viltiesziedas.receptai.model.repository;

import lt.viltiesziedas.receptai.model.entity.Vartotojas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VartotojasRepository extends JpaRepository<Vartotojas, Long> {
    Vartotojas findByUsername(String username);
}
