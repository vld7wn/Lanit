package HomeWork1;

import HomeWork1.model.Kotik;


public class Application {

    public static void main(String[] args) throws InterruptedException {

        Kotik first = new Kotik(10, "String name", 5, "meow");
        Kotik second = new Kotik(5, "String", 4, "gaf");

        first.liveAnotherDay();
        System.out.println(first.name + " " + first.weight);

        if (first.meow.equals(second.meow))
            System.out.println("Мы разговариваем одинаково))");
         else
            System.out.println("Мы разные((");

        System.out.println(Kotik.counter);
    }
}
