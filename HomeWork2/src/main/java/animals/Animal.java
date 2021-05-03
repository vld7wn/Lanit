package animals;

import foods.Food;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }


//    public abstract void eat(Food food);
    public abstract boolean eat(Food food);
}
