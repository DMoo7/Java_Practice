import java.util.Arrays;

public class Mathematics {

    public static void main(String[] args) {

    }

    static long fastPower (long a, long b, int n) {

        long res = 1;

        while ( b > 0) {

            if ( ((b &1) != 0 )) {
                res = (res * a % n) * n;
            }

            a = (a % n * a % n) % n;
            b = b >> 1;
        }
        return res;
    }

    static int getGCD (int a, int b ) {

        return a % b == 0 ? b : getGCD( a % b, b);
    }

    static boolean[] sieveOfErontheneses(int n) {

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i ) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
