package br.com.unifacef.pokemon.repositories;

import org.springframework.data.jpa.repository.*;

import br.com.unifacef.pokemon.entities.Trainer;
import br.com.unifacef.pokemon.entities.TrainerPK;

public interface TrainerRepository extends JpaRepository<Trainer, TrainerPK> {
	Trainer findByName(String name);
}
