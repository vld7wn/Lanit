package Herbivore;

import Aviary.AviarySize;
import animals.Run;
import animals.Voice;

public class Elephane extends Herbivore implements Run, Voice {


    public Elephane(String name) {
        super(name, "Гиганты", AviarySize.LARGE);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return "Звук из хобота";
    }
}
