package com.argprog.portfolio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

@Entity(name = "tipoempleo")
public class Tipo_Empleo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_tipo;

    public Tipo_Empleo( String nombre_tipo) {
        //this.id = id;
        this.nombre_tipo = nombre_tipo;
    }
    
    

    public Tipo_Empleo() {
    }

    

}
