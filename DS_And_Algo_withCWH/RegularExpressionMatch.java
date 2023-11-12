// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
// '.' Matches any single character.
//'*' Matches zero or more of the preceding element.
// Input: s = "aa", p = "a"
// Output: false
// Explanation: "a" does not match the entire string "aa".
//
// 1) trim the string
// 2) Check if string length is < 1 then return the string
// 3) if First String reached it's limit then Second String must be at the limit
// First case is
// String s = "aa", String p = "a" or String s = "aa", String p = "."
// 3) Check whether first character match with other string first character or other string first character is (".").
// Second case is
// String s = "aaaaa", String p = "a*"
// 4) Second case if second character of String p ("*")
// String s = "aaaaa", String p = "a*b"
// 5) There is one another case in Second case only
// Third case is
// String s = "aa", String p = "ab" -> j + 1 !== "*"
// 5) Third case if second character of Sting p !== ("*")

public class RegularExpressionMatch {

    public static boolean isMatch( String s, String p) {
        return match(0 ,0 ,s ,p);
    }

    public static boolean match(int i, int j, String s, String p) {
        boolean result = false;
        if (j == p.length()) return i == s.length();

        // First Case
        boolean firstMatch = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        // Second Case
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            // aaaaaa
            // a* or a*b
            result = (firstMatch && match(i + 1, j, s, p) || match(i, j + 2, s , p));
        } else {
            // Third Case
            // aa
            // ab -> (j + 1) != '*'
            result = (firstMatch && match(i + 1, j + 1, s, p ));
        }
        return result;
    }

    public static void main(String[] args) {

        String s = "ab";
        String p = "a*b";
        boolean result = isMatch( s, p);
        System.out.println(result);
    }
}
