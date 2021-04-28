package animals.Carnivorous;

import animals.*;
import foods.*;

public abstract class Carnivorous extends Animal {


    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat)
            System.out.println("Meat" + food);
        if (food instanceof Grass)
            System.out.println("!!Grass!!" + food);

    }
}
