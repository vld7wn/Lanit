import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculater {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Calculater cal = new Calculater();

        System.out.print("Press first number: ");
        Float a = Float.parseFloat(reader.readLine());

        System.out.print("Press apperator: ");
        String operator = reader.readLine();

        System.out.print("Press second number: ");
        Float b = Float.parseFloat(reader.readLine());


        System.out.println("" + cal.calculate(a, b, operator));
    }

    public Object calculate(Object a, Object b, Object operator) {
        float result = 0;
        if (operator.equals("+")) result = (Float) a + (Float) b;
        if (operator.equals("-")) result = (Float) a - (Float) b;
        if (operator.equals("*")) result = (Float) a * (Float) b;
        if (operator.equals("/"))
            try {
                result = (Float) a / (Float) b;
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by zero");
                return false;
            }
        return result;
    }
}
