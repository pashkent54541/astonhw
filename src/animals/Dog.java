package animals;

public class Dog extends Animal {

    private static int dogCounter;
    public Dog(String name) {
        super(name, 500, 10, "Dog");
        dogCounter++;
    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
