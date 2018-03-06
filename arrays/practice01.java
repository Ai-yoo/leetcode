package arrays;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/1/28
 * @Time 0:36
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 说明：给定一个整数数组，返回两个数字的索引，使它们加起来成为一个特定的目标。
 * 您可能会认为每个输入都只有一个解决方案，而且您可能不会使用相同的元素两次。
 * 例：
 * 鉴于NUMS = [2，7，11，15]，目标= 9，
 * 因为NUMS [ 0 ] + NUMS [ 1 ] = 2 + 7 = 9，
 * 返回[ 0，1 ]。
 */
public class practice01 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 7, 8, 9};
        int[] a = twoSum(nums, 11);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer n = hashMap.get(nums[i]);
            if (n == null) {
                hashMap.put(nums[i], i);
            }
            Integer m = hashMap.get(target - nums[i]);
            if (m != null) {
                a[0] = m + 1;
                a[1] = i + 1;
                return a;
            }
        }
        return a;
    }


}
