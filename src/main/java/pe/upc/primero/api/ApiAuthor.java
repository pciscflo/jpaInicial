package pe.upc.primero.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.upc.primero.business.NegocioAuthor;
import pe.upc.primero.entidades.Author;

@RestController
@RequestMapping("/api")
public class ApiAuthor {
    @Autowired
    private NegocioAuthor negocioAuthor;

    @PostMapping("/author")
    public Author registrar(@RequestBody Author author){
        return negocioAuthor.insertar(author);
    }

}
