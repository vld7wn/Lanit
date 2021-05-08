package Carnivorous;


import Aviary.AviarySize;
import animals.Fly;
import animals.Swim;
import animals.Voice;


public class Duck extends Carnivorous implements Swim, Fly, Voice {


    public Duck(String name) {
        super(name, "Птицы", AviarySize.HUGE);
    }

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }

    @Override
    public String voice() {
        return "Кря";
    }

}
