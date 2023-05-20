package pe.upc.primero.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.primero.business.NegocioAuthor;
import pe.upc.primero.entidades.Author;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiAuthor {
    @Autowired
    private NegocioAuthor negocioAuthor;

    @PostMapping("/author")
    public Author registrar(@RequestBody Author author){
        return negocioAuthor.insertar(author);
    }
    @GetMapping("/authors")
    public List<Author> listado(){ //Wrapper
        return negocioAuthor.listado();
    }

}
