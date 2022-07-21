package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.FormularioContacto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.portfolio.service.IFormulario;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class ControllerFormulario {

    @Autowired
    private IFormulario formularioContactoServ;

    
    @PostMapping("/new/formulario")
    public void agregarFormularioContacto(@RequestBody FormularioContacto formulario) {
        formularioContactoServ.crearFormularioContacto(formulario);
    }

    @GetMapping("/list/formulario")
    @ResponseBody
    public List<FormularioContacto> verFormularioContacto() {
        return formularioContactoServ.verFormularioContacto();
    }

    @GetMapping("/find/formulario/{id}")
    public FormularioContacto buscarFormularioContacto(@PathVariable Long id) {
        return formularioContactoServ.buscarFormularioContacto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/formulario/{id}")
    public void borrarFormularioContacto(@PathVariable Long id) {
        formularioContactoServ.borrarFormularioContacto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/formulario")
    public void editarFormularioContacto(@RequestBody FormularioContacto formulario) {

        formularioContactoServ.editarFormularioContacto(formulario);
    }

}
