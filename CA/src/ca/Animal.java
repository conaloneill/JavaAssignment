package ca;

public abstract class Animal{
	// not sure what this is for?
	private static final int MAX_SIZE = 10;
	
	// these should be marked as private so that the get and set are the only thing that can access/change them
	int age;
	// questions seems to want it as just speed, not maxspeed
	int maxspeed;
	
	// abstract classes do have a constructor instead they are basically a template class
	public Animal(int age, int maxspeed) {
		super();
		this.age=age;
		this.maxspeed=maxspeed;
	}
	
	// the argument here is off which is causing your error in the tests.
	// this method is looking to get a single int value for the speed to compare to.
	// but in the test you are trying to pass in the complete Dog class
	// "Boolean isOlder = dog2.isOlder(dog1);"
	// To do that you need the method to accept an argument of a Animal variable so:
	// final boolean isFaster(Animal animal2) {...}
	final boolean isFaster(int maxspeed1) {
		// now that the argument is a class object not an int, you need to get the speed variable from the class.
		// in addition you can run this as a one line piece where you just return the result of the comparison directly.
		if(maxspeed>maxspeed1) {
			return true;
		}
		else return false;
	}
	
	// as above with isFaster
	final boolean isOlder(int age1) {
		if(age>age1) {
			return true;
		}
		else return false;
	}
	

	// out of habit i would normally do this.age, or this.speed for any class variables as i find it easier to read that way
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	
	// Question says that this method is to be abstract so there is no implementation to be done in Animal class.
	// the implementation is good, but just need to be moved into Dog and Cat classes.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (maxspeed != other.maxspeed)
			return false;
		return true;
	}
	
	
	// toString does not need to be marked with Override
	@Override
	// method is missing some of what the questions is asking for in how to print the values
	public String toString() {
		return "The " + age + "The " +  maxspeed;
	}
	
	
	// This is actually a decent implementation so fair play!!
	// It's almost exactly how I did it myself.
	// Only thing is that it needs to be moved into the Dog and Cat classes as questions says this method is to be marked abstract.
    Animal[] multiply(Integer number) {
		// When you are declaring an array and giving it the size you can just give it the size of the number in the argument
        Animal[] animalArray = new Animal[MAX_SIZE];

        for (int i = 0; i < number; i++) {
        	// instead of hardcoding the values here, you should use the variables from the Dog/Cat class. (this is possible when the method is moved into those classes)
            animalArray[i] = new Dog(0, 20, "collie", Type.PASTORAL);
        }

        return animalArray;
	}

}
