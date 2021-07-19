package trabalho.teii.trabalho.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trabalho.teii.trabalho.model.entity.ponto.Banco_de_horas;

public interface BancoHorasRepository extends JpaRepository<Banco_de_horas, Long> {
}
