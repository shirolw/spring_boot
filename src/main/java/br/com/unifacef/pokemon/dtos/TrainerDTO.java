package br.com.unifacef.pokemon.dtos;

public class TrainerDTO {
	private Long trainerId;
	private String age;
	private String image;
	
	public TrainerDTO() {
		
	}

	public TrainerDTO(Long trainerId, String age, String image) {
		super();
		this.trainerId = trainerId;
		this.age = age;
		this.image = image;
	}

	public Long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
