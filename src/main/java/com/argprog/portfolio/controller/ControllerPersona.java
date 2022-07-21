package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Persona;
import com.argprog.portfolio.service.IPersonaService;

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

public class ControllerPersona {

    @Autowired
    private IPersonaService persoServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    @GetMapping("/list/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @GetMapping("/find/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/persona")
    public void editarPersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }

}
