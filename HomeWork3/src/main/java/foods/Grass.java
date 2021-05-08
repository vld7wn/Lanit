package foods;

public class Grass extends Food {
    @Override
    String getName() {
        return "Grass ";
    }

    @Override
    public String toString() {
        return getName();
    }
}
