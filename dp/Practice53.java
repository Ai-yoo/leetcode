package dp;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/6/20
 * @Time 17:47
 */
public class Practice53 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 1, 5, 9};
        System.out.println(maxSum(arr));
        System.out.println(maxSum1(arr));
    }

    public static int maxSum(int[] array) {
        int[] f = new int[array.length];
        f[0] = array[0];
        for (int i = 1; i < f.length; i++) {
            f[i] = f[i - 1] < 0 ? array[i] : f[i - 1] + array[i];
        }
        int sum = f[0];
        for (int a : f) {
            if (a > sum) {
                sum = a;
            }
        }
        return sum;
    }

    public static int maxSum1(int[] array) {
        int curr = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (curr > 0) {
                curr += array[i];
            }  else {
                curr = array[i];
            }
            if (curr > sum) {
                sum = curr;
            }
        }
        return sum;
    }
}
