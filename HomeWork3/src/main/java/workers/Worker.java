package workers;

import animals.*;
import foods.*;


public class Worker {

    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }

}
