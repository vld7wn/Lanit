package Carnivorous;

import Aviary.*;
import animals.*;
import foods.*;

public abstract class Carnivorous extends Animal {


    public Carnivorous(String name, String type, AviarySize size) {
        super(name, type, size);
    }

    @Override
    public void eat(Food food) {
        try {
            if (food instanceof Meat)
                System.out.println("Meat" + food);
            if (food instanceof Grass)
                System.out.println("!!Grass!!" + food);
            throw new WrongFoodException();
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }
}
