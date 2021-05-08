package Herbivore;

import Aviary.AviarySize;
import animals.Run;

public class Deer extends Herbivore implements Run {


    public Deer(String name) {
        super(name, "Лесные", AviarySize.HUGE);
    }

    @Override
    public void run() {
    }
}
