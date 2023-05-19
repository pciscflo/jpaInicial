package pe.upc.primero.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.primero.entidades.Author;

public interface RepositorioAuthor extends JpaRepository<Author,Integer> {
}
