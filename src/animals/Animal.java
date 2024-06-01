package animals;

public abstract class Animal {

    private static int animalCounter;
    protected final String name;
    protected final String type;

    protected final int maxRunDistance;

    protected final int maxSwimDistance;

    protected Animal(String name, int maxRunDistance, int maxSwimDistance, String type) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.type = type;
        animalCounter++;
    }

    public void run(int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance can not be negative");
        }
        if (distance > maxRunDistance) {
            System.out.println(type + " can not run more than " + maxRunDistance + " meters");
        }
        else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance can not be negative");
        }
        if (distance > maxSwimDistance) {
            System.out.println(type + " can not swim more than " + maxSwimDistance + " meters");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}
