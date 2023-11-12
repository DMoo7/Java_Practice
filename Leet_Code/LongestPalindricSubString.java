public class LongestPalindricSubString {

    public String longestPalidricSubString (String s) {
        if (s.length() <= 1) return s;

        int maxLength = 1;
        int start = 0, end=0;

        // Even Length
            for (int i = 0; i < s.length() -1; ++i) {
                int l =i, r=i + 1;
                while ( l >=0 && r < s.length()) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l--;
                        r++;
                    } else {
                        break;
                    }
                    int len = r-l-1;
                    if (len > maxLength) {
                        maxLength = len;
                        start = l+1;
                        end = r-1;
                    }
                }
            }
            // Odd Length
            for (int i = 0; i < s.length() -1; ++i) {
                int l = i, r=i;
                while ( l >=0 && r < s.length()) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l--;
                        r++;
                    } else {
                        break;
                    }
                    int len = r-l-1;
                    if (len > maxLength) {
                        maxLength = len;
                        start = l+1;
                        end = r-1;
                    }
                } }
        return s.substring(start, end+1);
    }

    public static void main(String[] args) {
        LongestPalindricSubString ins1 = new LongestPalindricSubString();
        String s = "abb";
        String result = ins1.longestPalidricSubString(s);
        System.out.println(result);
    }
}
