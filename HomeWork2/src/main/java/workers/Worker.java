package workers;

import animals.Animal;
import animals.Voice;
import foods.Food;

public class Worker {

    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }

}
