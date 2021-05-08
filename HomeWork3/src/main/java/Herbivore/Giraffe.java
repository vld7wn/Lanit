package Herbivore;

import Aviary.AviarySize;
import animals.Run;
import animals.Voice;

public class Giraffe extends Herbivore implements Run, Voice {


    public Giraffe(String name) {
        super(name, "Высокие", AviarySize.HUGE);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return "Как-то";
    }
}
