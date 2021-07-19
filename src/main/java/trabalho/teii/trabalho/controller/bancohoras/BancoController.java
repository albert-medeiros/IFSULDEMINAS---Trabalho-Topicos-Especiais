package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.*;
import trabalho.teii.trabalho.model.entity.Usuario;
import trabalho.teii.trabalho.model.repositories.BancoRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class BancoController {
    //CRUDs

    //READ
    //Método List
    private BancoRepository bancoRepository;

    public BancoController(BancoRepository bancoRepository){
        this.bancoRepository = bancoRepository;
    }
    @GetMapping
    public List<Usuario> list(){
        return bancoRepository.findAll();
    }

    //Método Show
    @GetMapping("/{id}")
    public Usuario show(@PathVariable Long id){
        return bancoRepository.getById(id);
    }

    //Método Save
    public Usuario save(@RequestBody Usuario usuario){
        return bancoRepository.save(usuario);
    }
}