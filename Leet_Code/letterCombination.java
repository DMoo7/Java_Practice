import java.util.*;

public class letterCombination {

    // It is dialPad
    static Map<Character, String> dialPad = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno",'7', "pqrs"
    , '8', "tuv", '9', "wxyz");


    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
//        for (String i : printStringToNumber("23", 0, str, dialPad, result)) {
//            System.out.println(i);
//        };

        for (String i: giveAllPermutations("abc", "def", 0,0, str, result)) {
            System.out.println(i);
        }


    }

    static List<String> printStringToNumber (String phoneNo, int idx, StringBuilder str, Map<Character, String> dialPad, List<String> result) {

        if (phoneNo.length() == 0) return result;

        //base Case
        if (idx == phoneNo.length()) {
            result.add(str.toString());
            return result;
        }

        //Logic

        String s = dialPad.get(phoneNo.charAt(idx));

        for (int j = 0; j < s.length(); j++) {

            str.append(s.charAt(j));
            printStringToNumber(phoneNo, idx + 1, str, dialPad, result);
            str.deleteCharAt(str.length() - 1);
        }

        return result;

    }

    static List<String> giveAllPermutations (String s1, String s2, int idx1, int idx2, StringBuilder str, List<String> result) {

        //base case
        if (idx2 == s2.length() || idx1 == s1.length()) {
            result.add(str.toString());
            return result;
        }

        str.append(s1.charAt(idx1));
        str.append(s2.charAt(idx2));
        giveAllPermutations(s1, s2, idx1 + 1,idx2 + 1, str, result);

        return result;
    }


}
