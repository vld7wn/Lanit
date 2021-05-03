package animals.Carnivorous;

import animals.*;

public class Tiger extends Carnivorous implements Run, Voice {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void run() {
    }

    @Override
    public String voice() {
        return "Арррр";
    }
}
