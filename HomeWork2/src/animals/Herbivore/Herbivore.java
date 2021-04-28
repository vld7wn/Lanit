package animals.Herbivore;

import animals.*;
import foods.*;

public abstract class Herbivore extends Animal {


    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass)
            System.out.println("Grass" + food);
        if (food instanceof Meat)
            System.out.println("!!Grass!!" + food);
    }
}
