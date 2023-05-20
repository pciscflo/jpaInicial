package pe.upc.primero.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.primero.business.NegocioAuthor;
import pe.upc.primero.entidades.Author;

import java.util.List;
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RestController
@RequestMapping("/api")
public class ApiAuthor {
    @Autowired
    private NegocioAuthor negocioAuthor;

    @PostMapping("/authors")
    public Author registrar(@RequestBody Author author){
        return negocioAuthor.insertar(author);
    }
    @GetMapping("/authors")
    public List<Author> listado(){ //Wrapper
        return negocioAuthor.listado();
    }
    @PutMapping("/authors")
    public Author actualizar(@RequestBody Author author) throws Exception {
        return negocioAuthor.actualizar(author);
    }
    @GetMapping("/authors/{id}")
    public Author listaId(@PathVariable(value = "id") Integer id){
        return negocioAuthor.listaID(id);
    }


}
