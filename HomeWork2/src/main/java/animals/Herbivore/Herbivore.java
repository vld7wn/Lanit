package animals.Herbivore;

import animals.*;
import foods.*;

public abstract class Herbivore extends Animal {


    public Herbivore(String name) {
        super(name);
    }

//    @Override
//    public void eat(Food food) {
//        if (food instanceof Grass) System.out.println("This i eating: " + food);
//        else System.out.println("What are you? This applies to MEAT!! " + food);
//    }

    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass) return true;
        return false;
    }
}
