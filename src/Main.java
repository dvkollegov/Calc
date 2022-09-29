import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
        System.out.println(Main.calc(scanner.nextLine()));
        }

    }

    public static String calc(String input) {

            String inputCalc = input;
            String number1;
            String number2;
            String operator;

            //разбиваем  введену строку на блоки и присваиваем значение переменным
            String[] blocks = input.split("[+-/*]");
            if (input.length() > 0 && blocks.length == 2) {
                number1 = blocks[0].trim();
                number2 = blocks[1].trim();
                operator = input.substring(blocks[0].length(), input.length() - blocks[1].length());
            } else {
                throw new IllegalArgumentException("Вы ввели неверное математическое выражение: " + input);
            }

            //здесь происходит само вычисление калькулятора
            int result = 0;
            if (ArabicOrRoman.isArabicNumber(number1) && ArabicOrRoman.isArabicNumber(number2)) {
                result = Calculate.calculate(Integer.parseInt(number1), Integer.parseInt(number2), operator);
                return String.valueOf(result);

            } else if (ArabicOrRoman.isRomanNumber(number1) && ArabicOrRoman.isRomanNumber(number2)) {
                result = Calculate.calculate(DigitalConvertor.RomanToArabic(number1), DigitalConvertor.RomanToArabic(number2), operator);
                return DigitalConvertor.ArabicToRoman(result);

            } else {
                throw new IllegalArgumentException("Вы неправильно ввели: " + input);
            }
    }
}
