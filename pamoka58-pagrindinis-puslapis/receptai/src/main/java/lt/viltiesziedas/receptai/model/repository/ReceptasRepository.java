package lt.viltiesziedas.receptai.model.repository;

import lt.viltiesziedas.receptai.model.entity.Receptas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptasRepository extends JpaRepository<Receptas, Long> {
    List<Receptas> findByPavadinimasLike(String pavadinimas);
    Receptas findById(long id);

}
