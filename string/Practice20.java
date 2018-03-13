package string;

import java.util.Stack;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/13
 * @Time 9:45
 */
public class Practice20 {

    public static void main(String[] args) {
        Practice20 practice20 = new Practice20();
        System.out.println(practice20.isValid("()"));
        System.out.println(practice20.isValid("()[]{}"));
        System.out.println(practice20.isValid("(]"));
        System.out.println(practice20.isValid("([)]"));
        System.out.println(practice20.isValid("("));
        System.out.println(practice20.isValid("(("));
        System.out.println(practice20.isValid("(()("));
    }

    public boolean isValid(String s) {
        Stack stack = new Stack();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (stack.isEmpty() || (char)stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
