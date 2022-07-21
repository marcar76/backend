package com.argprog.portfolio.service;

import java.util.List;
import com.argprog.portfolio.model.Conocimiento;
import com.argprog.portfolio.repository.ConocimientoRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ConocimientoService implements IConocimiento{
    
  
    @Autowired
    public ConocimientoRepository conocimientoRepo;

    @Override
    public List<Conocimiento> verConocimiento() {
        return conocimientoRepo.findAll();
    }

    @Override
    public void crearConocimiento(Conocimiento conocimiento) {
        conocimientoRepo.save(conocimiento);
    }

    @Override
    public void borrarConocimiento(Long id) {
        conocimientoRepo.deleteById(id);
    }

    @Override
    public Conocimiento buscarConocimiento(Long id) {
        return conocimientoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarConocimiento(Conocimiento conocimiento) {
        conocimientoRepo.save(conocimiento);
        
    }
}

 
