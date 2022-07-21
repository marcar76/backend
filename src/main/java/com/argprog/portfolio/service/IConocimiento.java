package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.Conocimiento;

public interface IConocimiento {
   
    public List<Conocimiento> verConocimiento();
    public void crearConocimiento(Conocimiento conocimiento);
    public void borrarConocimiento(Long id);
    public Conocimiento buscarConocimiento(Long id);
    public void editarConocimiento ( Conocimiento conocimiento);
    
}


