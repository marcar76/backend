package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.Login;

public interface ILogin {
    public List<Login> verLogin();
    public void crearLogin(Login login );
    public void borrarLogin(Long id);
    public Login buscarLogin(Long id);
    public void editarLogin( Login login);
}
