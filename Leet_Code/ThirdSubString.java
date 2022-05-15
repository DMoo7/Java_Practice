import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdSubString {

    public int getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
                System.out.println(" start  " + start + " currchar : " + currChar + " output : " + output);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
                System.out.println("  output " + output + " currchar : " + currChar + " output : " + output);
            }
            visited.put(currChar, end);
            System.out.println("  visited  " + visited + " currchar : " + currChar + " output: " + output);
        }
        return output.length();
    }

    public static void main(String[] args) {
        String s = "pwwkew";

        ThirdSubString in1 = new ThirdSubString();
        int result = in1.getUniqueCharacterSubstring(s);

        System.out.println(result);

    }

}
