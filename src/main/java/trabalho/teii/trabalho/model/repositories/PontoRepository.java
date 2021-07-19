package trabalho.teii.trabalho.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trabalho.teii.trabalho.model.entity.ponto.Ponto;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
}
