package animals;

import Aviary.AviarySize;
import foods.*;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private String type;

    private AviarySize size;

    public abstract void eat(Food food) throws WrongFoodException;

    public Animal(String name, String type, AviarySize size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }


    public AviarySize getSize() {
        return size;
    }
    public void setSize(AviarySize size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, size);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return type.equals(animal.type) && name.equals(animal.name) && size.equals(animal.size);
    }
}
