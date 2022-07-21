package com.argprog.portfolio.service;

import com.argprog.portfolio.model.FormularioContacto;
import java.util.List;

public interface IFormulario {

    public List<FormularioContacto> verFormularioContacto();

    public void crearFormularioContacto(FormularioContacto formulario);

    public void borrarFormularioContacto(Long id);

    public FormularioContacto buscarFormularioContacto(Long id);

    public void editarFormularioContacto(FormularioContacto formulario );
}
