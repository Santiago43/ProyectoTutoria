package mintic.proyectotutoria.controlador;

import mintic.proyectotutoria.modelo.Gato;
import mintic.proyectotutoria.servicio.ServicioGato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/gatos")
public class GatoControlador {
    @Autowired
    private ServicioGato servicio;

    @GetMapping("/obtenerTodos")
    public List<Gato> obtenerGatos(){
        return servicio.obtenerTodosLosGatos();
    }
}
