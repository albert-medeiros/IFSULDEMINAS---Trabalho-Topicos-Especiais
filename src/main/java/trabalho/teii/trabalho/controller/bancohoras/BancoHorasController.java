package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalho.teii.trabalho.model.entity.ponto.Banco_de_horas;
import trabalho.teii.trabalho.model.entity.ponto.Horas_usadas;
import trabalho.teii.trabalho.model.repositories.BancoHorasRepository;
import trabalho.teii.trabalho.model.repositories.HorasUsadasRepository;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {

    //CRUDs

    //Reads
    //Método List
    private BancoHorasRepository bancoHorasRepository ;
    public BancoHorasController(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    @GetMapping
    public List<Banco_de_horas> list(){return bancoHorasRepository.findAll();
    }
    @GetMapping("/{id}")
    //Método Show
    public Banco_de_horas show(@PathVariable Long id){
        return bancoHorasRepository.getById(id);
    }
}
