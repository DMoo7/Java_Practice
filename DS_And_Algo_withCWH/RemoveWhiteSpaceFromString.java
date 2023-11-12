public class RemoveWhiteSpaceFromString {


    public static StringBuilder removeSpaceFromString (String input) {

        StringBuilder result = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                result.append(c);
        }

        return result;
    }

    public static String removeSpaceUsingStrip(String input) {
        return input.strip();
    }

    public static void main(String[] args) {

        String input = "\fa b c";
        System.out.println(removeSpaceFromString(input));
        System.out.println(removeSpaceUsingStrip(input));
    }
}