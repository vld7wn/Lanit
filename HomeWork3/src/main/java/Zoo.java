import Aviary.*;
import Carnivorous.*;
import Herbivore.*;
import animals.*;
import foods.*;
import workers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        Animal[] animals = {duck, piranya, tigger, deer, giraffe, elephane};

        //тровоядным
        Chamomile chamomile = new Chamomile();
        TreeLeaves treeLeaves = new TreeLeaves();
        Fruit fruit = new Fruit();

        //плотоядным
        Veal veal = new Veal();
        Fish fish = new Fish();
        Insects insects = new Insects();

        Food[] foods = {chamomile, treeLeaves, fruit, veal, fish, insects};

        Worker worker = new Worker();
        System.out.println("!!Time to feed animals!!");
        System.out.println("!!!Carnivorous!!!");
        //worker.feed(duck, fruit);
        worker.feed(piranya, fish);
        worker.feed(tigger, veal);
        worker.feed(duck, insects);
        System.out.println("Herbivore");
        worker.feed(giraffe, treeLeaves);
        worker.feed(elephane, chamomile);
        worker.feed(deer, fruit);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Voice");
        Voice[] voices = {duck, elephane, giraffe, tigger};
        for (Voice voice : voices) {
            worker.getVoice(voice);
        }
        System.out.println("#############################################################");

        List<Swim> pond = new ArrayList<>();
        pond.add(duck);
        pond.add(piranya);

        pond.forEach(swim -> swim.swim());

        System.out.println("Add Aviary");
        System.out.println("//////////////////////////////////////////////////////////////");

        Aviary<Carnivorous> aviarySmall = new Aviary(AviarySize.SMALL);
        Aviary<Herbivore> aviaryMedium = new Aviary(AviarySize.MEDIUM);
        Aviary<Herbivore> aviaryLARGE = new Aviary(AviarySize.LARGE);
        Aviary<Carnivorous> aviaryHUGE = new Aviary(AviarySize.HUGE);

        Aviary[] aviaries = {aviarySmall, aviaryMedium, aviaryLARGE, aviaryHUGE,};
        for (Aviary aviary : aviaries) {
            aviary.add(animals[new Random().nextInt(animals.length)]);
            aviary.remove(animals[new Random().nextInt(animals.length)].getName());
            System.out.println("//////////////////////////////////////////////////////////////");
        }
    }
}
