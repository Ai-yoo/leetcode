package string;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/4/8
 * @Time 16:30
 */
public class Practice489 {
    public static void main(String[] args) {

        System.out.println(new Practice489().repeatedSubstringPattern("abab"));
    }
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        if (s == "" || s == null) {
            return false;
        }
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String str = s.substring(0, i);
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 0; j < m; j++) {
                    stringBuffer.append(str);
                }
                if (stringBuffer.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
