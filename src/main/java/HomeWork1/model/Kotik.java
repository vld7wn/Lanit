package HomeWork1.model;

public class Kotik {
    public static int prettiness;
    public static String name;
    public static int weight;
    public String meow;


    private int satiety;
    private String foodName;


    public static int counter = 0;




    public static int getWeight() {
        return weight;
    }

    public static int getPrettiness() {
        return prettiness;
    }

    public static String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }


    public Kotik(int prettiness, String name, int weight, String meow) {
        Kotik.prettiness = prettiness;
        Kotik.name = name;
        Kotik.weight = weight;
        this.meow = meow;
        counter++;
    }


    public void eat() {
        eat(5, "Kit");
    }

    public int eat(int satiety) {
        satiety += satiety;
        return satiety;
    }

    public void eat(int satiety, String foodName) {
        this.satiety = satiety;
        this.foodName = foodName;
    }



    public boolean play(){
        boolean i;
        if (!(satiety <= 0)) {
            i = true;
            satiety -= 1;
        } else {
            i = false;
        }

        return i;
    }

    public boolean sleep() {
        boolean i;
        if (!(satiety <= 0)) {
            i = true;
            satiety -= 1;
        } else {
            i = false;
        }

        return i;
    }

    public boolean chaseMouse() {
        boolean i;
        if (!(satiety <= 0)) {
            i = true;
            satiety -= 1;
        } else {
            i = false;
        }

        return i;
    }

    public boolean jump() {
        boolean i;
        if (!(satiety <= 0)) {
            i = true;
            satiety -= 1;
        } else {
            i = false;
        }

        return i;
    }

    public boolean run() {
        boolean i;
        if (!(satiety <= 0)) {
            i = true;
            satiety -= 1;
        } else {
            i = false;
        }

        return i;
    }



    public void liveAnotherDay() throws InterruptedException {

        for (int i = 1; i <= 24; i++) {
            Thread.sleep(500);

            if (!(satiety <= 0)) {

                switch ((int) (Math.random() * 5 + 1)) {
                    case 1 -> {
                        play();
                        System.out.println(i + " Play" + " " + satiety);
                    }
                    case 2 -> {
                        sleep();
                        System.out.println(i + " Sleep" + " " + satiety);
                    }
                    case 3 -> {
                        chaseMouse();
                        System.out.println(i + " chaseMouse" + " " + satiety);
                    }
                    case 4 -> {
                        jump();
                        System.out.println(i + " jump" + " " + satiety);
                    }
                    case 5 -> {
                        run();
                        System.out.println(i + " run" + " " + satiety);
                    }
                }

            } else {
                System.out.print(i + " Я хочу есть!!!!!");
                Thread.sleep(100);
                System.out.print(" Я ем!!! " + foodName);
                Thread.sleep(500);
                eat();
                System.out.println(" Я поел.");
            }
        }
    }
}
