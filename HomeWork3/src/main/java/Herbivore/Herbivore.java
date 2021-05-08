package Herbivore;

import Aviary.*;
import animals.*;
import foods.*;

public abstract class Herbivore extends Animal {


    public Herbivore(String name, String type, AviarySize size) {
        super(name, type, size);
    }

    @Override
    public void eat(Food food) {
        try {
            if (food instanceof Grass)
                System.out.println("Grass" + food);
            if (food instanceof Meat)
                System.out.println("!!Grass!!" + food);
                throw new WrongFoodException();
        }  catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
}
