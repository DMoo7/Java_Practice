public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        boolean result = false;
        if ( x < 0) return result;
        int input = x;
        int reverse = 0;
        int lastDigit = 0;
        while ( input != 0 ) {
            lastDigit = input % 10;
            input /= 10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) return false;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) return false;
            reverse = reverse * 10 + lastDigit;
        }
        if ( reverse == x) return result = true;
        return result;
    }

    public static void main(String[] args) {

        PalindromeNumber inst1 = new PalindromeNumber();
        boolean result = inst1.isPalindrome(123);
        System.out.println(result);

    }
}
