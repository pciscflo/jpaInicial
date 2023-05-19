package pe.upc.primero.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.primero.entidades.Author;
import pe.upc.primero.repositorio.RepositorioAuthor;
@Service
public class NegocioAuthor {
    @Autowired
    private RepositorioAuthor repositorioAuthor; //inyectando el repositorio

    public Author insertar(Author author){
        return repositorioAuthor.save(author);
    }
}
