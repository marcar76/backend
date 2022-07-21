package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.FormularioContacto ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<FormularioContacto , Long> {

}
