package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/7
 * @Time 9:27
 */

/**
 * 给定一个pattern和一个字符串str，找到if是否str遵循相同的模式。

 这里跟随意味着完全匹配，这样在一个字母pattern和一个非空的单词之间有一个双射str。

 例子：
 pattern = "abba"，str = "dog cat cat dog"应该返回true。
 pattern = "abba"，str = "dog cat cat fish"应该返回false。
 pattern = "aaaa"，str = "dog cat cat dog"应该返回false。
 pattern = "abba"，str = "dog dog dog dog"应该返回false。
 */
public class practice290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }
    public static boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        //首先判断长度
        if (pattern.length() != strs.length) {
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<Character, String>();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (hashMap.containsKey(c)) {
                if (!hashMap.get(c).equals(strs[i])) {
                    return false;
                }
            }
            else {
                if (set.contains(strs[i])) {
                    return false;
                }
                hashMap.put(c, strs[i]);
                set.add(strs[i]);
            }
        }

        return true;
    }
}
