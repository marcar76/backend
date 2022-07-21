package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.ExperienciaLaboral;
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
public class ControllerExperienciaLaboral {

    @Autowired
    private ITipoEmpleo tipoEmpleoServ;
    @Autowired
    private IExperienciaLaboral experienciaLaboralServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/experiencialaboral")
    public void agregarExperienciaLaboral(@RequestBody ExperienciaLaboral experiencialaboral) {
        experienciaLaboralServ.crearExperienciaLaboral(experiencialaboral);
    }

    @GetMapping("/list/experiencialaboral")
    @ResponseBody
    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return experienciaLaboralServ.verExperienciaLaboral();
    }

    @GetMapping("/find/experiencialaboral/{id}")
    public ExperienciaLaboral buscarExperienciaLaboral(@PathVariable Long id) {
        return experienciaLaboralServ.buscarExperienciaLaboral(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/experiencialaboral/{id}")
    public void borrarExperienciaLaboral(@PathVariable Long id) {
        experienciaLaboralServ.borrarExperienciaLaboral(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/experiencialaboral")
    public void editarExperienciaLaboral(@RequestBody ExperienciaLaboral experiencialaboral) {
        experienciaLaboralServ.editarExperienciaLaboral(experiencialaboral);
    }

}
