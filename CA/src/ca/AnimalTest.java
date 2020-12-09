package ca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testEquals() {
        
        // Type is failing here as you have the enum declared inside the Dog class so the code cant find it
        // If you do Dog.Type.PASTORAL instead to tell it to look for Type instead the Dog class, it should work
        // However it would be better still to pull Type outside the Dog class to have it as a global variable.
        // I have it done this way in my code
        Animal dog1 = new Dog(10, 20, "collie", Type.PASTORAL);
        Animal dog2 = new Dog(15, 30, "collie", Type.PASTORAL);

        assertFalse(dog1.equals(dog2));

    }

    @Test
    void testToString() {
        Animal dog = new Dog(12, 30, "collie", DogType.PASTORAL);
        assertEquals("Dog (collie: PASTORAL) is 12 years old, and 30 units fast.", dog.toString());
    }

    @Test
    void isFaster() {
        Animal dog1 = new Dog(10, 20, "collie", Type.PASTORAL);
        Animal dog2 = new Dog(15, 30, "collie", Type.PASTORAL);

        Boolean isFaster = dog2.isFaster(dog1);

        assertTrue(isFaster);
    }

    @Test
    void isOlder() {
        Animal dog1 = new Dog(10, 20, "collie", Type.PASTORAL);
        Animal dog2 = new Dog(15, 30, "collie", Type.PASTORAL);

        Boolean isOlder = dog2.isOlder(dog1);

        assertTrue(isOlder);
    }

    @Test
    void multiply() {
        Animal dog = new Dog(Animal.MAX_SIZE, 20, "collie", DogType.PASTORAL);
        Animal[] dogs = dog.multiply(3);
        for (int i =0; i < 3; i++) {
            assertNotNull(dogs[i]);
            assertEquals(0, dogs[i].getAge());
        }
        for (int i =3; i < Animal.MAX_SIZE; i++) {
            assertNull(dogs[3]);
        }
    }
}
