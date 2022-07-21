package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Tipo_Empleo;
import com.argprog.portfolio.service.IExperienciaLaboral;
import com.argprog.portfolio.service.ITipoEmpleo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTipoEmpleo {

    @Autowired
    private ITipoEmpleo tipoEmpleoServ;

    @Autowired
    private IExperienciaLaboral experienciaLaboralServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/tipoempleo")
    public void agregarTipoEmpleo(@RequestBody Tipo_Empleo tipoempleo) {
        tipoEmpleoServ.crearTipoEmpleo(tipoempleo);
    }

    @GetMapping("/list/tipoempleo")
    @ResponseBody
    public List<Tipo_Empleo> verTipoEmpleo() {
        return tipoEmpleoServ.verTipoEmpleo();
    }

    @GetMapping("/find/tipoempleo/{id}")
    public Tipo_Empleo buscarTipoEmpleo(@PathVariable Long id) {
        return tipoEmpleoServ.buscarTipoEmpleo(id);
        
        
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/tipoempleo/{id}")
    public void borrarTipoEmpleo(@PathVariable Long id) {
        tipoEmpleoServ.borrarTipoEmpleo(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/tipoempleo")
    public void editarTipoEmpleo(@RequestBody Tipo_Empleo tipoempleo) {
        tipoEmpleoServ.editarTipoEmpleo(tipoempleo);
    }

}
