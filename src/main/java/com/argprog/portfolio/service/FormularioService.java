 
package com.argprog.portfolio.service;

import com.argprog.portfolio.model.FormularioContacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.portfolio.repository.FormularioRepository;
import javax.transaction.Transactional;

 @Service
 @Transactional
public class FormularioService implements IFormulario {

     @Autowired
     public FormularioRepository FormularioRepo;
     
    @Override
    public List<FormularioContacto> verFormularioContacto() {
        return FormularioRepo.findAll();
    }

    @Override
    public void crearFormularioContacto(FormularioContacto formulario) {
        FormularioRepo.save(formulario);
    }

    @Override
    public void borrarFormularioContacto(Long id) {
        FormularioRepo.deleteById(id);
    }

    @Override
    public FormularioContacto buscarFormularioContacto(Long id) {
        return FormularioRepo.findById(id).orElse(null);
    }

    @Override
    public void editarFormularioContacto(FormularioContacto formulario) {
        FormularioRepo.save(formulario);
    }
    
}
