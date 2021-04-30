package Carnivorous;

import Aviary.AviarySize;
import animals.Swim;

public class Piranya extends Carnivorous implements Swim {


    public Piranya(String name) {
        super(name, "Рыбы", AviarySize.SMALL);
    }

    @Override
    public void swim() {
    }
}
