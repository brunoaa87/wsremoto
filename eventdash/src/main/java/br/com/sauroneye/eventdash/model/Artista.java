package br.com.sauroneye.eventdash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Pra dizer que essa classe terá uma tabela no BD
@Table(name="TB_ARTISTA") // Criando a tabela TB_ARTISTA

public class Artista {
	
	@Id // INforma que o atributo está associado a PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Aplica o auto-incremento
	@Column(name="id")
	private int id;
	
	@Column(name="nomeartistico", length=30)
	private String nomeArtistico;
	
	@Column(name="nacionalidade", length=30)
	private String nacionalidade;
	 
	@OneToMany(mappedBy="artista", cascade =CascadeType.ALL) // Cascade faz com que qlqr alteração feita no artista altere a musia
	@JsonIgnoreProperties("artista") // Serve para ele não repetir eternamento os mesmos dados, pq dentro de artista ele tras musica, e dentro e musica ele tras artista
	private List<Musica> musicas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	public Artista(int id, String nomeArtistico, String nacionalidade, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}
	public Artista() {
		super();
	}
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade
				+ ", musicas=" + musicas + "]";
	}
	
	
}

