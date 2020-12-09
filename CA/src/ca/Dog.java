package ca;

final class Dog extends Animal{
    String breed;
	public enum Type{
		HOUND,
		GUNDOG,
		TERRIER,
		UTILITY,
		WORKING,
		PASTORAL,
		TOY,
	    }
    // this.Type does not work as it is not a variable.
	// you would need to have
//     private Type type;
	// then you can do the below while also passing in the argument as a Type not String
//	 public void dogType(Type type) { this.type = type; }
	public void dogType(String Type) {
		this.Type = Type;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Dog(int age, int maxspeed,String breed,Type a) {
		
		// super not needed as Animal wont have a constructor as it is an abstract class.
		super(age,maxspeed);
		this.breed=breed;
		
	}
	
	
	
	
	
}