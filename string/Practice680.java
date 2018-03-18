package string;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/18
 * @Time 9:44
 */
public class Practice680 {
    public static void main(String[] args) {
        System.out.println(new Practice680().valiPalindrome("aba"));
        System.out.println(new Practice680().valiPalindrome("abca"));
    }

    public boolean valiPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return isVali(s, i + 1, j) || isVali(s, i, j - 1);
            }
        }
        return true;
    }

    public static boolean isVali(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
