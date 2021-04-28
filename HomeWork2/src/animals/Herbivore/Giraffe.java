package animals.Herbivore;

import animals.Herbivore.Herbivore;
import animals.Run;
import animals.Voice;

public class Giraffe extends Herbivore implements Run, Voice {
    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return "Как-то";
    }
}
