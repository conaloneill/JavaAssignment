package q2;


// this is not needed i just was using it to run a program to create a dog and cat and multiply the dog out and print the toString of each dog multiple.
public class main {
	public static void main(String[] args) {
		Cat cat = new Cat(CatType.HOUSE_CAT,10,30,"RagDoll");
		System.out.println(cat.toString());

		Dog dog = new Dog(DogType.GUNDOG, 12, 35, "Irish Setter");
		System.out.println(dog.toString());

		Animal[] test = dog.multiply(7);

		for (int i = 0; i < test.length; i++) {
			System.out.println("i=" + i + " : " + test[i].toString());
		}
	}
}
