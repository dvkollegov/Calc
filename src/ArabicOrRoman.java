public class ArabicOrRoman {
    //данный класс проверяет, что ввели в строку. Арабские или Римские цифры
    public static boolean isArabicNumber(String value) {
       if (value.matches("[0-9]") || "10".equals(value)) {
           return true;
       }
       return false;
    }


    public static boolean isRomanNumber(String value) {
        for (int i = 0; i < ValueRomanNumber.values().length; i++) {
            if (ValueRomanNumber.values()[i].name().equals(value)) {
                return true;
            }
        }
        return false;
    }

}
