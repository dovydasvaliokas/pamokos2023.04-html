package lt.viltiesziedas.receptai.model.repository;

import lt.viltiesziedas.receptai.model.entity.Receptas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptasRepository extends JpaRepository<Receptas, Long> {

}
