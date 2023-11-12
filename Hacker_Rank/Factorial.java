public class Factorial {

    public static int factorial(int input) {

        int output = 0;

        // Base case
        if (input == 1 || input == 0) {
            return input;
        }

        // Recursion

        int recResult = factorial(input - 1);

        // Small calculations

        output = input * recResult;
    return output;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
