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

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {

        Map<Character, Integer> values = new LinkedHashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i+1 == s.length() || values.get(s.charAt(i)) >= values.get(s.charAt(i + 1))) {
                number += values.get(s.charAt(i));
            } else {
                number -= values.get(s.charAt(i));
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int result = romanToInt("III");
        System.out.println(result);
    }
}
