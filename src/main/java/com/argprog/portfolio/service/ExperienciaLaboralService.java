package com.argprog.portfolio.service;



import java.util.List;
import com.argprog.portfolio.model.ExperienciaLaboral; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.portfolio.repository.ExperienciaLaboralRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class ExperienciaLaboralService implements IExperienciaLaboral{

     
    @Autowired
    public ExperienciaLaboralRepository experienciaLaboralRepo;

    @Override
    public List<ExperienciaLaboral> verExperienciaLaboral(){
        return experienciaLaboralRepo.findAll();
    }
    public void crearExperienciaLaboral(ExperienciaLaboral experiencialaboral ){
        experienciaLaboralRepo.save(experiencialaboral);
    }
    @Override
    public void borrarExperienciaLaboral(Long id) {
        experienciaLaboralRepo.deleteById(id);
    }
    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(Long id){
        return experienciaLaboralRepo.findById(id).orElse(null);
    }
    @Override
    public void editarExperienciaLaboral ( ExperienciaLaboral experiencialaboral) {
        experienciaLaboralRepo.save(experiencialaboral);        
    }



}
