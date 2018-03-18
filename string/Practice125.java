package string;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/17
 * @Time 19:17
 */
public class Practice125 {
    public static void main(String[] args) {
        System.out.println(new Practice125().isPalidrome("A man, a plan, a canal: Panama"));
        System.out.println(new Practice125().isPalidrome("race a car"));
        System.out.println(new Practice125().isPalidrome(""));
        System.out.println(new Practice125().isPalidrome("."));
    }

    public boolean isPalidrome(String s) {
        if (s.isEmpty() || s.equals(" ")) {
            return true;
        }
        String newStr = s.replaceAll("[^a-z^A-Z^0-9]", "").toLowerCase();
        if (newStr.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = newStr.length() - 1;
        while (i != j) {
            char c = newStr.charAt(i++);
            char c1 = newStr.charAt(j--);
            if (c != c1) {
                return false;
            }
            if (i == newStr.length() - 1 && j == 0) {
                return true;
            }
        }
        return true;
    }
}
