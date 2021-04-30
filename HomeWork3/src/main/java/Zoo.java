import Carnivorous.*;
import Herbivore.*;
import animals.*;
import foods.*;
import workers.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {


        //плотоядные
        Duck duck = new Duck("Вася");
        Piranya piranya = new Piranya("Жора");
        Tiger tigger = new Tiger("Барс");

        //тровоядные
        Deer deer = new Deer("Гриша");
        Giraffe giraffe = new Giraffe("Гоша");
        Elephane elephane = new Elephane("Хотабыч");

        //тровоядным
        Chamomile chamomile = new Chamomile();
        TreeLeaves treeLeaves = new TreeLeaves();
        Fruit fruit = new Fruit();

        //плотоядным
        Veal veal = new Veal();
        Fish fish = new Fish();
        Insects insects = new Insects();

        Worker worker = new Worker();
        System.out.println("!!Time to feed animals!!");
        System.out.println("!!!Carnivorous!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        worker.feed(duck, fruit);
        worker.feed(piranya, fish);
        worker.feed(tigger, veal);
        worker.feed(duck, insects);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Herbivore");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        worker.feed(giraffe, treeLeaves);
        worker.feed(elephane, chamomile);
        worker.feed(deer, fruit);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("#############################################################");
        System.out.println("Voice");
        System.out.println("#############################################################");
        worker.getVoice(duck);
        worker.getVoice(elephane);
        worker.getVoice(giraffe);
        worker.getVoice(tigger);
        System.out.println("#############################################################");

        List<Swim> pond = new ArrayList<>();
        pond.add(duck);
        pond.add(piranya);

        pond.forEach(swim -> swim.swim());

    }
}
