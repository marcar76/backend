package com.argprog.portfolio.service;

import java.util.List;

import com.argprog.portfolio.model.Login;
import com.argprog.portfolio.repository.LoginRepository;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService implements ILogin{
    
    @Autowired
    public LoginRepository loginRepo;

    @Override
    public List<Login> verLogin() {
        return loginRepo.findAll();
    }

    @Override
    public void crearLogin(Login login) {
        loginRepo.save(login);
    }

    @Override
    public void borrarLogin(Long id) {
        loginRepo.deleteById(id);
    }

    @Override
    public Login buscarLogin(Long id) {
        return loginRepo.findById(id).orElse(null);
    }

    @Override
    public void editarLogin(Login login) {
       loginRepo.save(login);
        
    }
}
