package com.argprog.portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity(name="formulariocontacto")

public class FormularioContacto implements  Serializable{

    

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String asunto;
    private String mensaje;
    private String notas;
    
     public FormularioContacto() {
    }

    public FormularioContacto(Long id, String nombre, String correo, String asunto, String mensaje, String notas) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.notas = notas;
    }
         
      
    
     

}
