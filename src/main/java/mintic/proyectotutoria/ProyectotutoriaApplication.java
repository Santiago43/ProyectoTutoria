package mintic.proyectotutoria;

import mintic.proyectotutoria.modelo.Gato;
import mintic.proyectotutoria.repositorio.RepositorioGato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
public class ProyectotutoriaApplication {
	@Autowired
	private RepositorioGato repo;
	public static void main(String[] args) {
		SpringApplication.run(ProyectotutoriaApplication.class, args);
	}
	@Bean
	ApplicationRunner applicationRunner(){
		return args -> {
			List<Gato> gatos = repo.obtenerTodos();
			System.out.println("Gatos: "+gatos.size());
		};
	}
}
