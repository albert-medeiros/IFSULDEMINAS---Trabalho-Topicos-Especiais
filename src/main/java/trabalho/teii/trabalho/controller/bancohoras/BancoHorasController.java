package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.*;
import trabalho.teii.trabalho.model.entity.ponto.Banco_de_horas;
import trabalho.teii.trabalho.model.entity.ponto.Ponto;
import trabalho.teii.trabalho.model.repositories.BancoHorasRepository;

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

    //Create
    //Método Save
    public Banco_de_horas save(@RequestBody Banco_de_horas banco_de_horas){return bancoHorasRepository.save(banco_de_horas);    }

    //Delete
    //Método Excluir
    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        bancoHorasRepository.deleteById(id);
    }

}
