package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.ExperienciaLaboral;

public interface IExperienciaLaboral {
   
    public List<ExperienciaLaboral> verExperienciaLaboral();
    public void crearExperienciaLaboral(ExperienciaLaboral experiencialaboral );
    public void borrarExperienciaLaboral(Long id);
    public ExperienciaLaboral buscarExperienciaLaboral(Long id);
    public void editarExperienciaLaboral ( ExperienciaLaboral experiencialaboral);
    
}


