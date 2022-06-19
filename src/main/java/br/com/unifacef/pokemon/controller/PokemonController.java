package br.com.unifacef.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.pokemon.services.PokemonServices;
import br.com.unifacef.pokemon.dtos.*;

@RestController
@RequestMapping(value="pokemons")
public class PokemonController {
	@Autowired
	PokemonServices pokemonInject;
	
	@GetMapping
	public Page<PokemonDTO> findAll(Pageable pageable) {
		return pokemonInject.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public PokemonDTO find(@PathVariable Long id) {
		return pokemonInject.findById(id);
	}
}
