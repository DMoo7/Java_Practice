// 1) trim the string
// 2) If string length is 0 then return 0;
// 3) define int i =0;
// 4) Just skip the whitespace through while loop,
// 5) Check whether number is '+' or '-';
// 6) If a string starts with a word then return zero.
// 7) First we verify for integer overflow and return INT_MAX or INT_MIN based on isPositive flag;


public class StringToInteger {

    public static Integer myAtoi(String s) {

        String result = s.trim();

        if (result.length() == 0) return 0;
        int i = 0;

        if (result.length() == 1) {
            if (result.charAt(i) == '+' || result.charAt(i) == '-') {
                return 0;
            }
        }

        boolean isPositive = true;

        if (result.charAt(i) == '+' || result.charAt(i) == '-') {
        isPositive = result.charAt(i) == '+';
            i++;
        }

        if (result.charAt(i) - '0' < 0 || result.charAt(i) - '9' > 9) {
            return 0;
        }

        // Checking Integer is overflow or not
        int num = 0;
        while (i < result.length() && result.charAt(i) >= '0' && result.charAt(i) <= '9' ) {
            if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && result.charAt(i) - '0' > 7)) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + (result.charAt(i) - '0');
            i++;
        }
        return isPositive ? num : num * -1;
    }

    public static void main(String[] args) {
        int result = myAtoi("      -143");
        System.out.println(result);
    }
}
