package com.argprog.portfolio.service;
import java.util.List;
import com.argprog.portfolio.model.Educacion;
import com.argprog.portfolio.repository.EducacionRepository; 
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacion{
    
    @Autowired
    public EducacionRepository educacionRepository;

    @Override
    public List<Educacion> verEducacion(){
        return educacionRepository.findAll();
    }
    public void crearEducacion(Educacion educacion ){
        educacionRepository.save(educacion);
    }
    @Override
    public void borrarEducacion(Long id) {
        educacionRepository.deleteById(id);
    }
    @Override
    public Educacion buscarEducacion(Long id){
        return educacionRepository.findById(id).orElse(null);
    }
    @Override
    public void editarEducacion ( Educacion educacion) {
        educacionRepository.save(educacion);        
    }






}
