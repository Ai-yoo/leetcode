package string;


/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/12
 * @Time 21:27
 */

/**
 * 给定两个字符串s和t，编写一个函数来确定t是否是s的一个字母。

 例如，
 s =“anagram”，t =“nagaram”，返回true。
 s =“rat”，t =“car”，返回false。
 */
public class Practice242 {
    public static void main(String[] args) {

        System.out.println(new Practice242().isAnagram("anagram","nagaram"));
        System.out.println(new Practice242().isAnagram("rat","car"));
    }
    public boolean isAnagram(String s, String t) {

        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            array[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
