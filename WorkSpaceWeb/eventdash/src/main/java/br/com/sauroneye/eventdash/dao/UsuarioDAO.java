package br.com.sauroneye.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sauroneye.eventdash.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	public Usuario findByEmailOrRacf(String email, String racf);


}
