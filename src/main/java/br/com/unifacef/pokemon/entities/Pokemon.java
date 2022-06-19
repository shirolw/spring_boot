package br.com.unifacef.pokemon.entities;

import javax.persistence.*;

@Entity
@Table(name="tb_pokemons")
public class Pokemon {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="shiny")
	private Boolean shiny;


	public Pokemon() {
		
	}
	
	public Pokemon(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Boolean getShiny() {
		return shiny;
	}
	
	public void setShiny(Boolean shiny) {
		this.shiny = shiny;
	}
}
