package mintic.proyectotutoria;

import mintic.proyectotutoria.repositorio.RepositorioGato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProyectotutoriaApplication {
	@Autowired
	private RepositorioGato repo;
	public static void main(String[] args) {
		SpringApplication.run(ProyectotutoriaApplication.class, args);
	}
}
