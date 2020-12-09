package q2;

public class Dog extends Animal {
	DogType type;
	String breed;
	
	public Dog(DogType dogType, int age, int speed, String breed) {
		this.setSpeed(speed);
		this.setAge(age);
		this.type = dogType;
		this.breed = breed;
		
	}
	
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " (" + this.breed + ": " + this.type + ") is " + this.getAge() + " years old, is " + this.getSpeed() + " units fast.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if obj is null
		if (obj == null) {
			return false;
		}
		
		// check if obj is an instance of Dog
		if (! (obj instanceof Dog)) {
			return false;
		}
		
		// attempt to cast obj to Dog class
		Dog testDog = (Dog) obj;
		// test individual variables if cast was successful
		return this.getAge() == testDog.getAge()
				&& this.getSpeed() == testDog.getSpeed()
				&& this.breed.equals(testDog.breed)
				&& this.type.equals(testDog.type);
	}
	
	@Override
	public Animal[] multiply(int num) {
		Animal[] result = new Animal[num];
		for (int i = 0; i < num; i++) {
			result[i] = new Dog(this.type, 0, this.getSpeed(), this.breed);
		}
		return result;
	}
}
