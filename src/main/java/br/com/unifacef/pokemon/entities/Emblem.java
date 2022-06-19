package br.com.unifacef.pokemon.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="tb_emblems")
public class Emblem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type;
	private String region;
	private String leader;
	
	private Set<Emblem> emblem = new HashSet<>();
	
	public Emblem () {
		
	}

	public Emblem(Long id, String type, String region, String leader, Set<Emblem> emblem) {
		super();
		this.id = id;
		this.type = type;
		this.region = region;
		this.leader = leader;
		this.emblem = emblem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public Set<Emblem> getEmblem() {
		return emblem;
	}

	public void setEmblem(Set<Emblem> emblem) {
		this.emblem = emblem;
	}
}
