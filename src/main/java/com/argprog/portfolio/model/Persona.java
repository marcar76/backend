package com.argprog.portfolio.model;

  
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 

import lombok.Setter;
import lombok.Getter;

//@Getter
@Setter
@Entity(name="persona")
public class Persona  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaNacimiento ;
    private String telefono;
    private String  correo;
    private String sobre_mi;
    private String url_foto;

    



    public Persona(Long id, String nombre, String apellido, String domicilio, LocalDate fechaNacimiento,String telefono, String correo, String sobre_mi, String url_foto) {
        this.idPersona = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
    }

   
    public Persona() {
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSobre_mi() {
        return sobre_mi;
    }

    public String getUrl_foto() {
        return url_foto;
    }
    
    
}
