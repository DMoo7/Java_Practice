public class FibonacciSeries {

    public static int fibonaciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonaciSeries(n-1) + fibonaciSeries(n-2);
    }

    public static void main(String[] args) {

        int n = 9;
        System.out.println(fibonaciSeries(n));
    }
}
