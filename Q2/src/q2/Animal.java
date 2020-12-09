package q2;

abstract class Animal {
	
	// instance variables
	private int age;
	private int speed;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//comparison methods
	final boolean isFaster(Animal animal2) {
		return this.speed > animal2.speed;
	}
	final boolean isOlder(Animal animal2) {
		return this.age > animal2.age;
	}
	
	public String toString() {
		// DogType is only an instance variable of the subclasses of Animal and thus the string can not have a type value here so just using this class's name
		return this.getClass().getSimpleName() + " is " + this.age + " years old, is " + this.speed + " units fast.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if obj is null
		if (obj == null) {
			return false;
		}
		
		// check if obj is an instance of Animal
		if (! (obj instanceof Animal)) {
			return false;
		}
		
		// attempt to cast obj to Animal class
		Animal testAnimal = (Animal) obj;
		// test individual variables if cast was successful
		return this.getAge() == testAnimal.getAge()
				&& this.getSpeed() == testAnimal.getSpeed();
	}
	
	public abstract Animal[] multiply(int num);
}

