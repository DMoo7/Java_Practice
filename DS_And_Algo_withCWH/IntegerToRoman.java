// "I" -> 1
// "IV" -> 4
// "V" -> 5
// "IX" -> 9
// "X" -> 10
// "XL" -> 40
// "L" -> 50
// "XC" -> 90
// "C" -> 100
// "CD" -> 400
// "D" -> 500
// "CM" -> 900
// "M" -> 1000



public class IntegerToRoman {

    public static String intToRoman(int num) {

        int[] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] stringCode = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intCode.length;) {
            if (num >= intCode[i]) {
                sb.append(stringCode[i]);
                num -= intCode[i];
            }
            if (num < intCode[i]) i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = intToRoman(2000);
        System.out.println(result);
    }
}
