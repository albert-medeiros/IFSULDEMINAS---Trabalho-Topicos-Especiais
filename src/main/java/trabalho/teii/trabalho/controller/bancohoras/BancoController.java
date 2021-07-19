package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalho.teii.trabalho.model.entity.Usuario;
import trabalho.teii.trabalho.model.repositories.BancoRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class BancoController {
    //CRUDs

    //Método List
    private BancoRepository bancoRepository;

    public BancoController(BancoRepository bancoRepository){
        this.bancoRepository = bancoRepository;
    }
    @GetMapping
    public List<Usuario> list(){
        return bancoRepository.findAll();
    }
}
