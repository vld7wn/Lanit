package animals.Carnivorous;


import animals.*;


public class Duck extends Carnivorous implements Swim, Fly, Voice {


    public Duck(String name) {
        super(name);
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
