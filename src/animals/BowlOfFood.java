package animals;

import java.util.concurrent.atomic.AtomicInteger;

public class BowlOfFood {

    private int foodAmount;

    public BowlOfFood(int quantityOfFood) {
        this.foodAmount = quantityOfFood;
        if (quantityOfFood < 0) {
            throw new IllegalArgumentException("Quantity of food can not be negative");
        }
    }

    public boolean eatFrom(Animal animal, int amount) {
        if (foodAmount - amount < 0) {
            System.out.println("Animal " + animal.name + " can't eat from bowl " + amount + ". Not enough amount ");
            return false;
        } else {
            System.out.println("Animal " + animal.name + " ate from bowl " + amount + ". In bowl left: " + foodAmount);
            foodAmount -= amount;
            return true;
        }
    }

    public void addFood(int foodAmount) {
        this.foodAmount += foodAmount;
    }

    @Override
    public String toString() {
        return "BowlOfFood{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
