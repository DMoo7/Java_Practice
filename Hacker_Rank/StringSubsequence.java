import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {

    static List<String> al = new ArrayList<>();

    public static void subSequence(String input, String tempString, int index) {

        if (input.length() == index) {
            al.add(tempString);
            return;
        }

        // Take char
        subSequence(input, tempString + input.charAt(index), index + 1);

        // Do not take char
        subSequence(input, tempString, index + 1);

    }

    public static void main(String[] args) {
        subSequence("abc", "", 0);
        System.out.println(al);
    }
}
