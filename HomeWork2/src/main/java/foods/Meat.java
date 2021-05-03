package foods;

import foods.Food;

public class Meat extends Food {

    @Override
    String getName() {
        return "Meat ";
    }
    @Override
    public String toString() {
        return getName();
    }
}
