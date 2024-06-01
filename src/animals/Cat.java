package animals;

import java.time.Instant;
import java.util.Date;

public class Cat extends Animal {

    private static int catCounter;
    private boolean isWellFeed;

    public Cat(String name) {
        super(name, 200, 0, "Cat");
        this.isWellFeed = false;
        catCounter++;
    }


    public void eat(BowlOfFood bowlOfFood, int foodToEat) {
        boolean res = bowlOfFood.eatFrom(this, foodToEat);

        if (res) {
            System.out.println("Cat " + name + " ate from bowl at: " + Instant.now());
            isWellFeed = true;
        } else {
            System.out.println("Cat can not eat from this bowl at: " + Instant.now() + ". Not enough food.");
            isWellFeed = false;
        }
    }

    public static int getCatCounter() {
        return catCounter;
    }

    @Override
    public String toString() {
        return "animals.Cat{" +
                "name='" + name + '\'' + "," +
                "isWellFeed=" + isWellFeed +
                '}';
    }
}
