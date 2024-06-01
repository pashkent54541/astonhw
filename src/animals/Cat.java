package animals;

public class Cat extends Animal {

    private static int catCounter;
    private boolean isWellFeed;

    public Cat(String name, boolean isWellFeed) {
        super(name, 200, 0, "Cat");
        this.isWellFeed = isWellFeed;
        catCounter++;
    }


    public void eat(BowlOfFood bowlOfFood, int foodToEat) {
        if (foodToEat > bowlOfFood.getQuantityOfFood()
                || bowlOfFood.getQuantityOfFood() - foodToEat < 0) {
            System.out.println("Cat can not eat from this bowl. Not enough food.");
            isWellFeed = false;
        } else {
            bowlOfFood.setQuantityOfFood(bowlOfFood.getQuantityOfFood() - foodToEat);
            isWellFeed = true;
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
