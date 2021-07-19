package trabalho.teii.trabalho.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trabalho.teii.trabalho.model.entity.ponto.Horas_usadas;

public interface HorasUsadasRepository extends JpaRepository<Horas_usadas, Long> {
}
