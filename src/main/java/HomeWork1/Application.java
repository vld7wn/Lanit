package HomeWork1;

import HomeWork1.model.Kotik;

/**Создать в корневом каталоге с программой класс
 * HomeWork1.Application с точкой входа в программу (метод public static void main(String[] args)).
 * В этом методе создать два экземпляр класса Kotik. Для первого экземпляра использовать конструктор с параметрами,
 * для второго конструктор без параметров в сочетании с методом
 * setKotik(int prettiness, String name, int weight, String meow) для инициализации переменных.
 * Вызвать у любого созданного экземпляра котика метод liveAnotherDay(),
 * а так же вывести на экран (в консоль) его имя и вес.
 * Вывести на экран результат сравнения одинаково ли разговаривают котики (сравнить переменные meow).
 * Последней строкой в методе main вывести на экран количество котиков, созданных в процессе выполнения программы.
 *
 * Требования
 *
 * Программа должна выводить на экран результат сравнения переменных meow у созданных объектов.
 *
 * Программа должна выводить на экран количество созданных объектов.
 */

public class Application {

    public static void main(String[] args) throws InterruptedException {

        Kotik first = new Kotik(10, "String name", 5, "meow");
        Kotik second = new Kotik(5, "String", 4, "gaf");

        first.liveAnotherDay();
        System.out.println(first.name + " " + first.weight);

        if (first.meow.equals(second.meow))
            System.out.println("Мы разговариваем одинаково))");
         else
            System.out.println("Мы разные((");

        System.out.println(Kotik.counter);
    }
}
