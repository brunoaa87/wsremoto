package br.com.sauroneye.eventdash.dao;

//CRUD --> CREATE, UPDATE, DELETE
import org.springframework.data.repository.CrudRepository;

import br.com.sauroneye.eventdash.model.Musica;

//No crud temos que falar qual o beans (Musica), e qual o tipo de dado que estamos usando para a chave primaria
public interface MusicaDAO extends CrudRepository<Musica, Integer>{

}
