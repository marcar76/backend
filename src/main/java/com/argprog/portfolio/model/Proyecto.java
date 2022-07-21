package com.argprog.portfolio.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity(name="proyecto")

public class Proyecto implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreproyecto;
    private String descripcion;
    private String link;
    private String urlfoto;

    public Proyecto(Long id, String nombreproyecto, String descripcion, String link, String urlfoto) {
        this.id = id;
        this.nombreproyecto = nombreproyecto;
        this.descripcion = descripcion;
        this.link = link;
        this.urlfoto = urlfoto;
    }

    public Proyecto() {
    }

}
