package com.argprog.portfolio.model;
import java.io.Serializable;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
 
 
 
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity(name="educacion")

public class Educacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    
    private String nombreeducacion;
    private String fechainicio;
    private String fechafin;
    private String descripcion;
    private String url;
    private String link;
	
 	 
        
    public Educacion() {
    }

    public Educacion(Long id, String nombreEducacion,  String fechaInicio, String fechaFin, String descripcion, String url, String link  ) {
        this.id = id;
        this.nombreeducacion = nombreEducacion;
        this.fechainicio = fechaInicio;
        this.fechafin = fechaFin;
        this.descripcion = descripcion;
        this.url = url;
        this.link=link;
        
    }

 
    
}
