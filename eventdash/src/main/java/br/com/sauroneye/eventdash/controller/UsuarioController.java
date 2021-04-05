package br.com.sauroneye.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sauroneye.eventdash.dao.UsuarioDAO;
import br.com.sauroneye.eventdash.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ArrayList<Usuario> recuperarTodos(){
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>) dao.findAll();
		return lista;
			
	}
	
	@PostMapping("/login")
	public Usuario fazerLogin(@RequestBody Usuario dadosLogin) {
		Usuario resultado = dao.findByEmailOrRacf(dadosLogin.getEmail(), dadosLogin.getRacf());
		if (resultado != null) {  // opa.. usuário existe
			if (resultado.getSenha().equals(dadosLogin.getSenha())) { // a senha confere
				return resultado;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}

	
	
	
}
