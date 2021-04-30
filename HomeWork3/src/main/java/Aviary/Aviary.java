package Aviary;

import animals.*;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private AviarySize size;
    private Map<String, T> animals;

    public Aviary(AviarySize size) {
        animals = new HashMap<>();
        this.size = size;
    }

    private Animal getAnimalName(String name) {
        return animals.get(name);
    }

    public void remove(String name) {
        if (animals.remove(name) == null) System.out.println(name);
        else System.out.println(name);
    }
    public void add(T animal){
        if (animal.getSize().getSize() < size.getSize())
            animals.put(animal.getName(), animal);
        else System.out.println("" + size + ""
                + animal.getType() + "" + animal.getName());
    }
}
