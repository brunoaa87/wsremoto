package br.com.sauroneye.eventdash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sauroneye.eventdash.dao.ArtistaDAO;
import br.com.sauroneye.eventdash.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired //Para que o SpringBoot faça gerencia dessa classe
	private ArtistaDAO dao;
	
	
	@PostMapping("/artistapost") 
	public ResponseEntity<Artista> getArtista(@RequestBody Artista artista) {
		Artista resultado = dao.findById(artista.getId()).orElse(null);
		if (resultado == null) {
			return ResponseEntity.status(404).build();
		}
			return ResponseEntity.ok(resultado);
		
	}
	
	/* 
	 * Nume analogia com uma carta
	 * Método Get --> o Numero da casa vem do lado de fora do envelope
	 * Método POST --> A informação vem dentro do envelope
	 *		Na maioria dos casos a gente espera um objeto
	 *
	 *Dá pra usar o get sempre? NAo
	 *Imagina passar 20 dados  (/artista/{cod}/{x}/{y}/{z} )
	 */
	
	
	//Json é o padrão de comunicação entre o JavaScript e o Java
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> getArtista(@PathVariable int cod) { // PathVariable é um notation pra dizer que o valor vai vir do path no link "/artista/x
		Artista resultado = dao.findById(cod).orElse(null);
		if(resultado == null) {
			return	 ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
		
	}

	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();  // = (List<Artista>) sere para fazer o cast dado
		//Seria o mesmo que:
		//String x = "XPTO";
		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	
			
	}
	
}
