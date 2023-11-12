public class ZigZagConversation {

    public static String stringConvertInZigZagPattern(String s, int numRows) {

        if (numRows == 1) return s;
        StringBuilder sbs = new StringBuilder();

        int step = (2 * numRows) - 2;

        for (int i = 0; i < numRows; i++) {

            // first and last row
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j = j + step) {
                    sbs.append(s.charAt(j));
                }
            }
            // middle rows
            else {
                int j = i;
                boolean flag = true;
                int step1 = 2 * (numRows - 1 - i);
                int step2 = step - step1;
                while (j < s.length()) {
                    sbs.append(s.charAt(j));
                    if (flag) {
                        j = j + step1;
                    } else {
                        j = j + step2;
                    }
                    flag = !flag;
                }
            }
        }
        return sbs.toString();
}

    public static void main(String[] args) {

        String input = "PAHNAPLSIIGYIR";

        String result = stringConvertInZigZagPattern(input, 3);
        System.out.println(result);
    }

}