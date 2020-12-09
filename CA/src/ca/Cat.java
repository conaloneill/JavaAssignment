package ca;

final class Cat extends Animal{
    String breed;
	public enum type{
		LION,
		TIGER,
		HOUSE_CAT,
		PUMA,
	}

	public Cat(int age, int maxspeed,String breed,type a) {
		super(age,maxspeed);
		this.breed=breed;
		
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", age=" + age + ", maxspeed=" + maxspeed + "]";
	}
	
}