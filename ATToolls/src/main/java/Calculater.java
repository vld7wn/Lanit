import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculater {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Calculater cal = new Calculater();

        System.out.print("Press apperator: ");
        char actions = reader.readLine().toCharArray()[0];

        System.out.print("Press first and second number: ");
        Float num1 = Float.parseFloat(reader.readLine()), num2 = Float.parseFloat(reader.readLine());


        System.out.println("" + cal.calculate(num1, num2, actions));
    }

    public Object calculate(Object first, Object second, Object action) {
        char actions = (char) action;
        Float num1 = (Float) first;
        Float num2 = (Float) second;

        switch (actions) {
            case ('+'):
                return num1 + num2;
            case ('-'):
                return num1 - num2;
            case ('*'):
                return num1 * num2;
            case ('/'):
                try {
                    return num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("You cannot divide by zero");
                    return false;
                }

        }
        return false;
    }
}
