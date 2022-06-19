package br.com.unifacef.pokemon.entities;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class TrainerPK implements Serializable {
	private static final long serialVersionUID = 6833481938622715702L;

	// Um treinador pode ter vários pokemons
	@ManyToOne
	@JoinColumn(name="pokemon_id")
	private Pokemon pokemon;
	
	// Um treinador pode ter apenas uma insignia
	// A insignia pode pertencer à apenas um treinador
	@OneToOne
	@JoinColumn(name="emblem_id")
	private Emblem emblem;
	
	public TrainerPK() {}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public Emblem getEmblem() {
		return emblem;
	}

	public void setEmblem(Emblem emblem) {
		this.emblem = emblem;
	}
}
