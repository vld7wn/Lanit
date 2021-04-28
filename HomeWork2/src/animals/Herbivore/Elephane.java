package animals.Herbivore;

import animals.Herbivore.Herbivore;
import animals.Run;
import animals.Voice;

public class Elephane extends Herbivore implements Run, Voice {
    public Elephane(String name) {
        super(name);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return "Звук из хобота";
    }
}
