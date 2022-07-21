package com.argprog.portfolio.service;

import java.util.List;
import com.argprog.portfolio.model.Tipo_Empleo;
import com.argprog.portfolio.repository.TipoEmpleoRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TipoEmpleoService implements ITipoEmpleo {
    
    @Autowired
    public TipoEmpleoRepository tipoEmpleoRepository;

    @Override
    public List<Tipo_Empleo> verTipoEmpleo() {
        return tipoEmpleoRepository.findAll();
    }
    public void crearTipoEmpleo(Tipo_Empleo tipoEmpleo ){
        tipoEmpleoRepository.save(tipoEmpleo);
        
        
    }
    @Override
    public void borrarTipoEmpleo(Long id) {
        tipoEmpleoRepository.deleteById(id);
    }
    @Override
    public Tipo_Empleo buscarTipoEmpleo(Long id){
        return tipoEmpleoRepository.findById(id).orElse(null);
    }
    @Override
    public void editarTipoEmpleo( Tipo_Empleo tipoEmpleo) {
        tipoEmpleoRepository.save(tipoEmpleo);
        
    }
   
}
