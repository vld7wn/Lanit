package animals.Carnivorous;

import animals.*;
import foods.*;

public abstract class Carnivorous extends Animal {


    public Carnivorous(String name) {
        super(name);
    }

//    @Override
//    public void eat(Food food) {
//        if (food instanceof Meat) System.out.println("This i eating: " + food);
//        else System.out.println("What are you? This applies to GRASS!! " + food);
//    }

    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) return true;
        return false;
    }
}
