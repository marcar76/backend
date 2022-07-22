package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity(name = "experiencialaboral")

public class ExperienciaLaboral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreempresa;
    private boolean estrabajoactual;
    private int fechainicio;
    private int fechafin;
    private String descripcion;
    private String url;
    private String link;

   



      @ManyToOne (fetch = FetchType.EAGER, optional=false)
    @JoinColumn(name = "idtipo")
    //@JsonProperty(access=Access.WRITE_ONLY)
    private Tipo_Empleo tipoempleo;

    public ExperienciaLaboral(Long id, String nombreempresa, boolean estrabajoactual, int fechainicio, int fechafin, String descripcion, String url, String link, Tipo_Empleo tipoempleo) {
        this.id = id;
        this.nombreempresa = nombreempresa;
        this.estrabajoactual = estrabajoactual;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.descripcion = descripcion;
        this.url = url;
        this.link = link;
        this.tipoempleo = tipoempleo;
    }
    
       public ExperienciaLaboral() {
    }

   
       

}
