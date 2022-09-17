package mintic.proyectotutoria.modelo;

import javax.persistence.*;

@Entity
@Table(name = "gato")
public class Gato {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idGato;
    private String nombre;
    private Integer edad;

    public Integer getIdGato() {
        return idGato;
    }

    public void setIdGato(Integer idGato) {
        this.idGato = idGato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
