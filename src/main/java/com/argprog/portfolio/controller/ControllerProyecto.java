package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Proyecto;
import com.argprog.portfolio.service.IProyecto;

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
public class ControllerProyecto {

    @Autowired
    private IProyecto proyectoServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proyecto) {
        proyectoServ.crearProyecto(proyecto);
    }

    @GetMapping("/list/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proyectoServ.verProyecto();
    }

    @GetMapping("/find/proyecto/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id) {
        return proyectoServ.buscarProyecto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proyectoServ.borrarProyecto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/proyecto")
    public void editarProyecto(@RequestBody Proyecto proyecto) {
        proyectoServ.editarProyecto(proyecto);
    }

}
