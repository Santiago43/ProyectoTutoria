package mintic.proyectotutoria.servicio;

import mintic.proyectotutoria.modelo.Gato;
import mintic.proyectotutoria.repositorio.RepositorioGato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioGato {
    @Autowired
    private RepositorioGato repo;
    public List<Gato> obtenerTodosLosGatos(){
        return repo.obtenerTodos();
    }
}
