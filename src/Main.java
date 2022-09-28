import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();
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
                    System.out.println(result);

                } else if (ArabicOrRoman.isRomanNumber(number1) && ArabicOrRoman.isRomanNumber(number2)) {
                    result = Calculate.calculate(DigitalConvertor.RomanToArabic(number1), DigitalConvertor.RomanToArabic(number2), operator);
                    System.out.println(DigitalConvertor.ArabicToRoman(result));

                }

        }
    }
}
