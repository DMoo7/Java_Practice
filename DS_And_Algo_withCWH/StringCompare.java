import java.util.ArrayList;
import java.util.List;

public class StringCompare {

    public static boolean checkString(String S) {

        String input = S.trim();
        boolean result = false;
        if (input.length() == 1) return true;
        List<Character> stringArr = new ArrayList<>();
        int k = 0;

        for (int h = 0; h < input.length(); h++ ) {
            stringArr.add(input.charAt(h));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b' || input.charAt(i) == 'a') {
                for (int j : stringArr) {
                    k += 0;
                    if (j == 'a' || k == input.length()) {
                        int index = stringArr.indexOf('b');
                        if (j == 'b' && stringArr.get(index + 1).equals('a')) {
                            result = false;
                            break;
                        }
                    }
                }
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "aaba";
        boolean result = checkString(input);
        System.out.println(result);
    }
}
