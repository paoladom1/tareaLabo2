package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

//USUARIO: paola
//CONTRASENIA: 1234

@Controller
public class MainController {
	@GetMapping("/login")
	public String enviarForm(Usuario user) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario user) {
		if(user.getUsuario().equals("paola") && user.getContrasenia().equals("1234")) {
			return "MostrarMensajeV";	
		} else {
			return "MostrarMensajeF";
		}
		
	}
}
