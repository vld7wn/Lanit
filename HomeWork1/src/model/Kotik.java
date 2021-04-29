package model;

public class Kotik {
    private static int counter = 0;
    private String name;
    private int weight;
    private int prettiness;
    private String meow;


    private int satiety = 5;
    private String foodName = "KitKat";

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public Kotik(String name, int weight, int prettiness, String meow) {
        this.name = name;
        this.weight = weight;
        this.prettiness = prettiness;
        this.meow = meow;
        counter++;
    }

    public Kotik() {
        counter++;
    }


    public void eat(int satietyValue, String foodName) {
        satiety += satietyValue;
    }

    public void eat(int satietyValue) {
        satiety += satietyValue;
    }

    public void eat() {
        eat(5, "KitKat");
    }


    public boolean play() {
        if (!(satiety <= 0)) {
            satiety -= 1;
            System.out.println(" Play");
            return true;
        } else {
            return false;
        }
    }

    public boolean sleep() {
        if (!(satiety <= 0)) {
            satiety -= 1;
            System.out.println(" Sleep");
            return true;
        } else {
            return false;
        }
    }

    public boolean chaseMouse() {
        if (!(satiety <= 0)) {
            satiety -= 1;
            System.out.println(" chaseMouse");
            return true;
        } else {
            return false;
        }
    }

    public boolean jump() {
        if (!(satiety <= 0)) {
            satiety -= 1;
            System.out.println(" jump");
            return true;
        } else {
            return false;
        }
    }

    public boolean run() {
        if (!(satiety <= 0)) {
            satiety -= 1;
            System.out.println(" run");
            return true;
        } else {
            return false;
        }
    }


    public void liveAnotherDay() throws InterruptedException {

        for (int i = 1; i <= 24; i++) {
                Thread.sleep(500);
            System.out.print(i);
                switch ((int) (Math.random() * 5 + 1)) {
                    case 1 -> {
                        act(play());
                    }
                    case 2 -> {
                        act(sleep());
                    }
                    case 3 -> {
                        act(chaseMouse());

                    }
                    case 4 -> {
                        act(jump());

                    }
                    case 5 -> {
                        act(run());
                    }
                }


            }
        }

    private void act(boolean action) throws InterruptedException {

        if (!action) {
            System.out.print(" Я хочу есть!!!!!");
               Thread.sleep(100);
            System.out.print(" Я ем!!! " + foodName);
              Thread.sleep(500);
            eat();
            System.out.println(" Я поел.");
        }
    }
}

