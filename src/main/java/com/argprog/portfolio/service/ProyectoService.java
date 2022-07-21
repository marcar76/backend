package com.argprog.portfolio.service;


import java.util.List;

import com.argprog.portfolio.model.Proyecto;
import com.argprog.portfolio.repository.ProyectoRepository;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyecto{
    
    @Autowired
    public ProyectoRepository proyectoRepo;

    @Override
    public List<Proyecto> verProyecto() {
        return proyectoRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
        
    }


}
