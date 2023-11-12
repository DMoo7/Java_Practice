public class ReverseString {


    public static void main(String[] args) {

        String input = "Dishant", result="";

        for (int i = 0 ; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }

        System.out.println(result);

    }
}