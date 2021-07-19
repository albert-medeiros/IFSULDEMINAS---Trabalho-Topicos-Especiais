package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalho.teii.trabalho.model.entity.ponto.Horas_usadas;
import trabalho.teii.trabalho.model.repositories.HorasUsadasRepository;

import java.util.List;

@RestController
@RequestMapping("/horasusadas")
public class HorasUsadasController {

    //CRUDs

    //Reads
    //Método List
    private HorasUsadasRepository horasUsadasRepository;

    public HorasUsadasController(HorasUsadasRepository horasUsadasRepository) {
        this.horasUsadasRepository = horasUsadasRepository;
    }

    @GetMapping
    public List<Horas_usadas> list(){
        return horasUsadasRepository.findAll();
    }

    @GetMapping("/{id}")
    //Método Show
    public Horas_usadas show(@PathVariable Long id){
        return horasUsadasRepository.getById(id);
    }
}
