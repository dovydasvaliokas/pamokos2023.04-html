package lt.viltiesziedas.receptai.model.repository;

import lt.viltiesziedas.receptai.model.entity.ReceptoKategorija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptoKategorijaRepository extends JpaRepository<ReceptoKategorija, Long> {
    ReceptoKategorija findById(long id);
}
