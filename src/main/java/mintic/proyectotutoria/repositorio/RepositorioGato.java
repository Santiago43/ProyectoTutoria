package mintic.proyectotutoria.repositorio;

import mintic.proyectotutoria.modelo.Gato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RepositorioGato {
    @Autowired
    private InterfaceGato crud;

    public List<Gato> obtenerTodos(){
        return (List<Gato>) crud.findAll();
    }
}
