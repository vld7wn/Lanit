package Carnivorous;

import Aviary.AviarySize;
import animals.Run;
import animals.Voice;

public class Tiger extends Carnivorous implements Run, Voice {


    public Tiger(String name) {
        super(name, "Кошачьих", AviarySize.MEDIUM);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return "Арррр";
    }
}
