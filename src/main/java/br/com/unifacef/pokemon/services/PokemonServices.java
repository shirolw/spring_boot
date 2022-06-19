package br.com.unifacef.pokemon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.unifacef.pokemon.dtos.PokemonDTO;
import br.com.unifacef.pokemon.entities.Pokemon;
import br.com.unifacef.pokemon.repositories.PokemonRepository;

@Service
public class PokemonServices {
	@Autowired
	private PokemonRepository inject;
	
	@Transactional(readOnly = true)
	public Page<PokemonDTO> findAll(Pageable pageable) {
		Page<Pokemon> pokemon = inject.findAll(pageable);
		Page<PokemonDTO> pokemonTeam = pokemon.map(x -> new PokemonDTO(x));
		return pokemonTeam;
	}
	
	@Transactional(readOnly = true)
	public PokemonDTO findById(Long id) {
		Pokemon pokemon = inject.findById(id).get();
		PokemonDTO pokemonDTO = new PokemonDTO(pokemon);
		return pokemonDTO;
	}
}
