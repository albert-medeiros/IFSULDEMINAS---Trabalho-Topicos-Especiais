package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.*;
import trabalho.teii.trabalho.model.entity.ponto.Ponto;
import trabalho.teii.trabalho.model.repositories.PontoRepository;

import java.util.List;

@RequestMapping("/pontos")
public class PontoController {
    //CRUDs

    //Reads
    //Método List
    private PontoRepository pontoRepository;

    public PontoController(PontoRepository pontoRepository) {
        this.pontoRepository = pontoRepository;
    }

    @GetMapping
    public List<Ponto> list(){
        return pontoRepository.findAll();
    }

    @GetMapping("/{id}")
    //Método Show
    public Ponto show(@PathVariable Long id){
        return pontoRepository.getById(id);
    }

    //Create
    //Método Save
    public Ponto save(@RequestBody Ponto ponto){
        return pontoRepository.save(ponto);
    }


    //Delete
    //Método Excluir
    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        pontoRepository.deleteById(id);
    }
}
