package com.argprog.portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity(name="login")
public class Login implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogin;
    
	
    private String nombre;
    private String contrasena;

	public Login(Long id, String nombre, String contrasena) {
		this.idLogin = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
    
	public Login() {
	}

	 
}

