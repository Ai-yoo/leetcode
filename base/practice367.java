package base;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/9
 * @Time 20:08
 */

/**
 * 给定一个正整数num，写一个函数返回True，如果num是一个完美的平方，否则为False。

 注意： 不要使用任何内置的库函数，如sqrt。
 */
public class practice367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(16));
    }

    /**
     * 所有的可开方的数都是1+3+5+7+9……的和
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num==0;
    }

}
