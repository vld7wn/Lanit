import model.Kotik;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        Kotik first = new Kotik("String", 10, 5, "meow");
        Kotik second = new Kotik();
        second.setName("name");
        second.setWeight(5);
        second.setPrettiness(2);
        second.setMeow("gav");

        first.liveAnotherDay();
        System.out.println("Name: " + first.getName() + "   " + "Weight: " + first.getWeight());

        if (first.getMeow().equals(second.getMeow())) System.out.println
                ("Мы разговариваем одинаково))");
        else System.out.println("Мы разные((");

        System.out.println(Kotik.getCounter());
    }
}
