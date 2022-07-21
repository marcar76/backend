package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.Proyecto;

public interface IProyecto {
   
    public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto proyecto);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
    public void editarProyecto ( Proyecto proyecto);
    
}


