import animals.Animal;
import animals.BowlOfFood;
import animals.Cat;
import animals.Dog;

import java.util.ArrayList;

public class Lecture4 {
    public static void main(String[] args) {


        Cat mars = new Cat("Mars",false);
        Cat baks = new Cat("Baks", false);
        Cat smoke = new Cat("Smoke", false);
        Cat orpheus = new Cat("Orpheus",false);
        Cat matthew = new Cat("Matthew",false);
        Dog dog1 = new Dog("Sobaka");

        mars.swim(30);
        mars.run(50);
        dog1.swim(10);
        dog1.swim(11);
        dog1.run(400);
        dog1.run(4222);
        dog1.swim(333);

        System.out.println(mars);
        System.out.println(Cat.getCatCounter());
        System.out.println(Dog.getDogCounter());
        System.out.println(Animal.getAnimalCounter());

        BowlOfFood bowlOfFood = new BowlOfFood(20);

        mars.eat(bowlOfFood,12);

        System.out.println(mars);
        System.out.println(bowlOfFood);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(mars);
        cats.add(baks);
        cats.add(smoke);
        cats.add(orpheus);
        cats.add(matthew);
        System.out.println(cats);


    }
}