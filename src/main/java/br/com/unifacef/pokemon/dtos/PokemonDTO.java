package br.com.unifacef.pokemon.dtos;

import br.com.unifacef.pokemon.entities.Pokemon;

public class PokemonDTO {
	private Long pokemonId;
	private String name;
	private Boolean shiny;
	private String type;
	
	public PokemonDTO() {
		
	}

	public PokemonDTO(Long pokemonId, String name, Boolean shiny, String type) {
		super();
		this.pokemonId = pokemonId;
		this.name = name;
		this.shiny = shiny;
		this.type = type;
	}

	public PokemonDTO(Pokemon pokemon) {
		this.pokemonId = pokemon.getId();
		this.name = pokemon.getName();
		this.shiny = pokemon.getShiny();
		this.type = pokemon.getType();
	}
	
	public Long getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Long pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getShiny() {
		return shiny;
	}

	public void setShiny(Boolean shiny) {
		this.shiny = shiny;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
