package com.argprog.portfolio.controller;

import java.util.List;

import com.argprog.portfolio.model.Login;
import com.argprog.portfolio.service.ILogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class ControllerLogin {
      
    @Autowired
    private ILogin loginServ;
    
    @PostMapping("/new/login")
    public void agregarLogin(@RequestBody Login login) {
        loginServ.crearLogin(login);
    }
    
    @GetMapping("/list/login")
    @ResponseBody
    public List<Login> verLogin() {
        return loginServ.verLogin();
    }
    @GetMapping("/find/login/{id}")
    public Login buscarLogin(@PathVariable Long id) {
        return loginServ.buscarLogin(id);
    }

    @DeleteMapping("/delete/login/{id}")
    public void borrarLogin(@PathVariable Long id) {
        loginServ.borrarLogin(id);
    }
    
    @PutMapping ("/save/login")
    public void editarLogin(@RequestBody Login login){
        loginServ.editarLogin(login);
    }
    
}
