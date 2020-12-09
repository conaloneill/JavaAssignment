package q2;

public class Cat extends Animal {
	
	int type;
	String breed;
	
	public Cat(CatType type, int age, int speed, String breed) {
		this.setSpeed(speed);
		this.setAge(age);
		this.breed = breed;
		
		switch (type) {
			case LION:
				this.type = 1;
				break;
			case TIGER:
				this.type = 2;
				break;
			case HOUSE_CAT:
				this.type = 3;
				break;
			case PUMA:
				this.type = 4;
				break;
		}
	}
	
	
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName() + " (" + this.breed + ": " + String.valueOf(CatType.values()[this.type-1]) + ") is " + this.getAge() + " years old, is " + this.getSpeed() + " " +
				"units " +
				"fast.";
	}
	
	@Override
	public boolean equals(Object obj) {
		// check if obj is null
		if (obj == null) {
			return false;
		}
		
		// check if obj is an instance of Cat
		if (! (obj instanceof Cat)) {
			return false;
		}
		
		// attempt to cast arg to Cat class
		Cat testCat = (Cat) obj;
		// test individual variables
		return this.getAge() == testCat.getAge()
				&& this.getSpeed() == testCat.getSpeed()
				&& this.breed.equals(testCat.breed)
				&& this.type == testCat.type;
	}
	
	@Override
	public Animal[] multiply(int num) {
		Animal[] result = new Animal[num];
		for (int i = 0; i < num; i++) {
			result[i] = new Cat(CatType.values()[this.type-1], 0, this.getSpeed(), this.breed);
		}
		return result;
	}
}
