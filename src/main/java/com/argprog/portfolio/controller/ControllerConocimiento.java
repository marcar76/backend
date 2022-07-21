package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Conocimiento;
import com.argprog.portfolio.service.IConocimiento;

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
public class ControllerConocimiento {

    @Autowired
    private IConocimiento conocimientoServ;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/conocimiento")
    public void agregarConocimiento(@RequestBody Conocimiento conocimiento) {
        conocimientoServ.crearConocimiento(conocimiento);
    }

    @GetMapping("/list/conocimiento")
    @ResponseBody
    public List<Conocimiento> verConocimiento() {
        return conocimientoServ.verConocimiento();
    }

    @GetMapping("/find/conocimiento/{id}")
    public Conocimiento buscarConocimiento(@PathVariable Long id) {
        return conocimientoServ.buscarConocimiento(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/conocimiento/{id}")
    public void borrarConocimiento(@PathVariable Long id) {
        conocimientoServ.borrarConocimiento(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/save/conocimiento")
    public void editarConocimiento(@RequestBody Conocimiento conocimiento) {
        conocimientoServ.editarConocimiento(conocimiento);
    }

}
