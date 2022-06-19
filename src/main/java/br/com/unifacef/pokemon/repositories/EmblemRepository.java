package br.com.unifacef.pokemon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.pokemon.entities.Emblem;

public interface EmblemRepository extends JpaRepository<Emblem, Long> {
	Emblem finbyType(String type);
}
