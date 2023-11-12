import java.util.Stack;

public class ParenthesisProblem {

    public boolean parenthesisCheck(String input) {
        Stack<Character> queue = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char eachChar = input.charAt(i);

            if (eachChar == '(' || eachChar == '{' || eachChar == '[') {
                queue.add(eachChar);
                continue;
            }

            if (queue.isEmpty()) return false;

            char check;
            switch (eachChar) {
                case ')':
                    check = queue.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case ']' :
                    check = queue.pop();
                    if (check == '(' || check == '{') return false;
                    break;
                case '}':
                    check = queue.pop();
                    if (check == '(' || check == '[') return false;
                    break;
            }
        }
            return (queue.isEmpty());
    }

    public static void main(String[] args) {

        String x = "([{({})}])";

        ParenthesisProblem inst1 = new ParenthesisProblem();
        boolean result = inst1.parenthesisCheck(x);

        System.out.println(result);

    }
}
