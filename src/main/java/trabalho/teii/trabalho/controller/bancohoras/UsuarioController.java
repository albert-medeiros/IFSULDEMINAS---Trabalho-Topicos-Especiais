package trabalho.teii.trabalho.controller.bancohoras;

import org.springframework.web.bind.annotation.*;
import trabalho.teii.trabalho.model.entity.Usuario;
import trabalho.teii.trabalho.model.repositories.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    //CRUDs

    //READ
    //Método List
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> list(){
        return usuarioRepository.findAll();
    }

    //Método Show
    @GetMapping("/{id}")
    public Usuario show(@PathVariable Long id){
        return usuarioRepository.getById(id);
    }

    //Método Save
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Método Update
    @PutMapping("/id")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario usuarioAux = usuarioRepository.getById(id);
        usuarioAux.setNome(usuario.getNome());
        usuarioAux.setAdmin(usuario.getAdmin());
        usuarioAux.setCarga_de_trabalho(usuario.getCarga_de_trabalho());
        usuarioAux.setTempo_de_almoco(usuarioAux.getCarga_de_trabalho());
        return usuarioRepository.save(usuarioAux);
    }

    //Método Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }

}

