package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Educacion;
import com.argprog.portfolio.service.IEducacion;

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
public class ControllerEducacion {

    @Autowired
    private IEducacion educacionServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion) {
        educacionServ.crearEducacion(educacion);
    }

    @GetMapping("/list/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return educacionServ.verEducacion();
    }

    @GetMapping("/find/educacion/{id}")
    public Educacion buscarEducacion(@PathVariable Long id) {
        return educacionServ.buscarEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        educacionServ.borrarEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/educacion")
    public void editarEducacion(@RequestBody Educacion educacion) {
        educacionServ.editarEducacion(educacion);
    }

}
