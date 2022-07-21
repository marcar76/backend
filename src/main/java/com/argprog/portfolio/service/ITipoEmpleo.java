package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.Tipo_Empleo;

public interface ITipoEmpleo {
   
    public List<Tipo_Empleo> verTipoEmpleo();
    public void crearTipoEmpleo(Tipo_Empleo tipoEmpleo );
    public void borrarTipoEmpleo(Long id);
    public Tipo_Empleo buscarTipoEmpleo(Long id);
    public void editarTipoEmpleo( Tipo_Empleo tipoEmpleo);
    
}


