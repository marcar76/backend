package com.argprog.portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

@Entity(name="conocimiento")
public class Conocimiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conocimiento;
    private int porcentaje;
    private String urlfoto;

    public Conocimiento() {
    }

    public Conocimiento(Long id, String conocimiento, int porcentaje, String urlfoto) {
        this.id = id;
        this.conocimiento = conocimiento;
        this.porcentaje = porcentaje;
        this.urlfoto = urlfoto;

    }

}
