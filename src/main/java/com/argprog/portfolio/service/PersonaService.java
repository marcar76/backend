package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);        
    }
    
    

    @Override
    public void borrarPersona(Long id) {
        
        Persona p = buscarPersona(id);
        p.setNombre(null);
        p.setApellido(null);
        p.setDomicilio(null);
        p.setTelefono(null);
        p.setCorreo(null);
        p.setSobre_mi(null);
        p.setUrl_foto(null);
        persoRepo.save(p);
         
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);

    }

    @Override
    public void editarPersona(Persona per) {
        Long id1 = 1l;
        per.setIdPersona(id1);
        persoRepo.save(per);

    }

     
     
    
     
}
