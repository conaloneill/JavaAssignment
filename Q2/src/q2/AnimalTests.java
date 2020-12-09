package q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTests {
	
	Animal dog, cat;
	
	// this re-initialise both dog and cat before running each Test
	// done so that you start with fresh values for each test
	@org.junit.jupiter.api.BeforeEach
	void setUp() {
		dog = new Dog(DogType.GUNDOG,12,30,"Irish Setter");
		cat = new Cat(CatType.HOUSE_CAT,10,30,"Ragdoll");
	}
	
	// this nulls out both dog and cat after running each Test
	@org.junit.jupiter.api.AfterEach
	void tearDown() {
		dog = null;
		cat = null;
	}
	
	@Test
	void toStringTest() {
		assertEquals("Dog (Irish Setter: GUNDOG) is 12 years old, is 30 units fast.", dog.toString());
		assertEquals("Cat (Ragdoll: HOUSE_CAT) is 10 years old, is 30 units fast.", cat.toString());
	}
	
	@Test
	void equalTest() {
		Animal dog1 = dog;
		assertEquals(dog1, dog);
		
		Animal cat1 = cat;
		assertEquals(cat1, cat);
		
		assertNotEquals(dog, cat);
	}
}