import java.util.InputMismatchException;

public class Calculate {
    //данный класс производит математические операции

    public static int calculate(int value1, int value2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                try {
                    result = value1 / value2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("На ноль делить нельзя: " + e);
                    break;
                }
        }
        return result;
    }
}
