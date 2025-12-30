package B6.Day_3;

import java.util.Stack;

public class BalanceParanthesis {

    static boolean are_parantheses_balanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            switch (ch) {

                case '(':
                    stack.push(ch);
                    break;

                case '[':
                    stack.push(ch);
                    break;

                case '{':
                    stack.push(ch);
                    break;

                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                    break;

                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                    break;

                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                    break;

                default:
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String[] testCases = { "[()]", "{[()]}", "{[(]})" };

        for (String test : testCases) {
            System.out.println(are_parantheses_balanced(test));
        }
    }
}
