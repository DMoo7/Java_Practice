public class Two_Power {

    public static int twoPower(int input) {


        // base case
        if (input == 1 || input == 0) {
            return 2;
        }

        // Recursion

        return 2 * twoPower(input - 1);
    }

    public static void main(String[] args) {
        System.out.println(twoPower(3));
    }
}
