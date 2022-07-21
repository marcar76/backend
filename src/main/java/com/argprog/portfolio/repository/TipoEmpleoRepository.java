package com.argprog.portfolio.repository;

import com.argprog.portfolio.model.Tipo_Empleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleoRepository extends JpaRepository<Tipo_Empleo, Long> {

}
