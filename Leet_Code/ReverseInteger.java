import static java.lang.Integer.parseInt;

public class ReverseInteger {

    public Integer reverseInteger(int x) {
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            System.out.println(Integer.MAX_VALUE/10);
            System.out.println(Integer.MIN_VALUE/10);
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
            reverse = reverse * 10 + lastDigit;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseInteger inst1 = new ReverseInteger();
        int result = inst1.reverseInteger(123456);

        System.out.println(result);
    }
}
