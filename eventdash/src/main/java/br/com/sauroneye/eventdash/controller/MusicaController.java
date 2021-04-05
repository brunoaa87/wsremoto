package br.com.sauroneye.eventdash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.com.sauroneye.eventdash.dao.MusicaDAO;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
}
