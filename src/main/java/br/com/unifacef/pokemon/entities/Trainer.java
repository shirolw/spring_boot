package br.com.unifacef.pokemon.entities;

import javax.persistence.*;

@Entity
@Table(name="tb_trainers")
public class Trainer {
	@EmbeddedId
	private TrainerPK id = new TrainerPK();	 
	
	private Integer age;
	private String name;
	private String image;
	
	public Trainer() {
		
	}
	
	public TrainerPK getId() {
		return id;
	}

	
	public void setPokemon(Pokemon pokemon) {
		this.id.setPokemon(pokemon);
	}
	
	public void setEmblem(Emblem emblem) {
		this.id.setEmblem(emblem);
	}

	public void setId(TrainerPK id) {
		this.id = id;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
}
