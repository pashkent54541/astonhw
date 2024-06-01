import animals.Animal;
import animals.BowlOfFood;
import animals.Cat;
import animals.Dog;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Lecture4 {
    public static void main(String[] args) {

        //собака плавает и бегает
        Dog sobaka = new Dog("Sobaka");

        sobaka.swim(10);
        sobaka.swim(11);
        sobaka.run(400);
        sobaka.run(4222);
        sobaka.swim(333);

        // вывести созданных собак
        System.out.println(Dog.getDogCounter());

        // создается миска
        BowlOfFood bowlOfFood = new BowlOfFood(Integer.MAX_VALUE);
        // создается массив котов
        List<Cat> cats = createCatsList();
        // каждый кот из этой миски кушает
        eatCatsFromBowl(cats, bowlOfFood);

        // вывести миску и котов
        System.out.println(bowlOfFood);
        System.out.println(cats);

        //вывести котов и всех животных
        System.out.println(Cat.getCatCounter());
        System.out.println(Animal.getAnimalCounter());

        //инициализируются фигуры и выводится информация о них в консоль
        Triangle triangle1 = new Triangle(3.0, 2.0, 4.0);
        System.out.println(triangle1 +
                " Площадь: "
                + triangle1.countArea()
                + " Периметр: "
                + triangle1.countPerimeter());

        Circle circle1 = new Circle(4.5, "Brown", "Purple");
        System.out.println(circle1 +
                " Площадь: "
                + circle1.countArea()
                + " Периметр: "
                + circle1.countPerimeter());

        Rectangle rectangle1 = new Rectangle(7.8,5.0);
        System.out.println(rectangle1 +
                " Площадь: "
                + rectangle1.countArea()
                + " Периметр: "
                + rectangle1.countPerimeter());

    }


    private static void eatCatsFromBowl(List<Cat> cats, BowlOfFood bowlOfFood) {
        for (Cat cat : cats) {
            cat.eat(bowlOfFood, new Random().nextInt(15));
        }

    }

    private static List<Cat> createCatsList() {
        Cat mars = new Cat("Mars");
        Cat baks = new Cat("Baks");
        Cat smoke = new Cat("Smoke");
        Cat orpheus = new Cat("Orpheus");
        Cat matthew = new Cat("Matthew");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(mars);
        cats.add(baks);
        cats.add(smoke);
        cats.add(orpheus);
        cats.add(matthew);
        return cats;
    }
}