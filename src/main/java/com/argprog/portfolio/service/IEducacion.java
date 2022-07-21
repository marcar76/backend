package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.Educacion;

public interface IEducacion {
   
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion educacion );
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    public void editarEducacion ( Educacion educacion);
    
}


