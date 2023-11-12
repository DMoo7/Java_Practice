public class PalindromeCheck {

    public static boolean palindromeStringCheck(String input) {
        String reverse = "";
        char ch;

        for (int i = 0; i < input.length(); i++) {

            ch = input.charAt(i);
            reverse = ch + reverse;
        }

        return reverse.equals(input);
    }

    public static void main(String[] args) {

        String input = "101";

        System.out.println(palindromeStringCheck(input));
    }
}
