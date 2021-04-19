package HomeWork1.model;


/**Изменить модификаторы доступа всех переменных в классе Kotik на private.
  Для доступа к переменным из других классов
  создать геттеры (public методы getName(), getWeight(), и т.д.)
 Требования

 Метод liveAnotherDay() должен выводить на экран 24 строки.

 Все переменные в классе Kotik должны быть private.

 Класс Kotik должен находиться в пакете model.

 Класс HomeWork1.Application должен находиться в корневой директории программы.

 Методы поведения котика (play(), sleep(), chaseMouse(), и. т.д) должны иметь возвращаемый тип данных boolean.

 Программа должна создавать два экземпляра класса Kotik
 */


public class Kotik {
    public static int prettiness;
    public static String name;
    public static int weight;
    public String meow;

    /**Так же добавить числовую переменную экземпляра
     * показывающую степень сытости котика,
     * как только она будет ноль или меньше, котик будет
     * отказываться выполнять любое действие, кроме eat().*/
    private int satiety;
    private String foodName;

    /**Добавить в класс Kotik статическую переменную,
     * отвечающую за количество созданных экземпляров класса.
     * К переменной должна применяться арифметическая
     * операция «инкремент» при создании экземпляра класса.*/

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

    public Kotik() {

    }


    /**третья не принимает параметров,
     * но содержит внутри себя вызов
     * перегрузки принимающей название еды и единицы сытости.
     * */
    public void eat() {
        eat(5, "Kit");
    }

    /**Сделать три перегрузки метода eat(), одна из них будет
     * принимать только количество условных единиц сытости,
     * и увеличивать на них соответствующую переменную экземпляра,
     * */

    public int eat(int satiety) {
        satiety += satiety;
        return satiety;
    }

    /**другая единицы сытости и название еды*/
    public void eat(int satiety, String foodName) {
        this.satiety = satiety;
        this.foodName = foodName;
    }



    /**Реализовать в классе Kotik дополнительные методы (5 шт),
     * описывающие его поведение, например play(), sleep(), chaseMouse() и т.д.*/
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

    /**Создать в классе котик метод liveAnotherDay(), в котором будет цикл на 24 итерации,
     * в каждой из которых будет случайным образом вызываться один из методов котика,
     * отвечающих за его поведение, и если котик вместо выполнения метода
     * будет просить есть - его надо будет покормить.
     * Подсказки

     Вызывать случайный метод можно с помощью случайного числа от 1го до Н, где Н - число методов,
     которые планируется вызывать, и оператора switch.

     Получить случайное число можно с помощью “Math.random()*Н + 1”*/

    public void liveAnotherDay() throws InterruptedException {
        for (int i = 1; i <= 24; i++) {
            Thread.sleep(500);
            if (!(satiety <= 0)) {
                switch ((int) (Math.random() * 4 + 1)) {
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
                }

                /**Если котик голоден - он будет просить есть,
                 * а не выполнять указанное действие.
                 * Методы описывающее поведение кота должны
                 * сигнализировать о том, выполнил его котик или нет.*/

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
