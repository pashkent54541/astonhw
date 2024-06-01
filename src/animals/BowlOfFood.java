package animals;

public class BowlOfFood {

    private int quantityOfFood;

    public BowlOfFood(int quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
        if (quantityOfFood < 0) {
            throw new IllegalArgumentException("Quantity of food can not be negative");
        }
    }

    public void addFood(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("You can not add negative quantity of food");
        }
        quantityOfFood = quantityOfFood + food;
    }

    public int getQuantityOfFood() {
        return quantityOfFood;
    }

    public void setQuantityOfFood(int quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
    }

    @Override
    public String toString() {
        return "animals.BowlOfFood{" +
                "quantityOfFood=" + quantityOfFood +
                '}';
    }
}
