package mintic.proyectotutoria.repositorio;

import mintic.proyectotutoria.modelo.Gato;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceGato extends CrudRepository<Gato, Integer> {
}
