
package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import java.util.List;
import java.util.Optional;


public interface IPersonaService  {
    
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void editarPersona(Persona per);
    
    
    
}
