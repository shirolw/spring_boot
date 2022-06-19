package br.com.unifacef.pokemon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.pokemon.entities.Pokemon;

public interface PokemonRepository  extends JpaRepository<Pokemon, Long>{
	Pokemon findByName(String name);
	Pokemon findByType(String type);
}
