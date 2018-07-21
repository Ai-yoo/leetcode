package arrays;


/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/1/26
 * @Time 23:32
 */

/**
 * 说明:给定两个排序整数数组nums1和nums2，将nums2合并为nums1作为一个排序数组。

 注意：
 您可能会认为nums1有足够的空间（大小大于或等于m + n）来保存nums2中的其他元素。在nums1和nums2中初始化的元素的数量分别是m和n。
 */
public class practice88 {
    public static void main(String[] args) {
        int[] a = new int[]{11, 13, 25, 30, 34, 67, 68, 99};
        int[] b = new int[]{0, 4, 9, 31, 45, 61, 77, 89, 90, 100};
        int[] mer=mergeSortArray(a, b);
        for (int i : mer) {
            System.out.println(i);
        }
    }

    public static int[] mergeSortArray(int[] A, int[] B) {
        int[] merge = new int[A.length + B.length];
        int a = 0, b = 0, temp = 0;
        while (a != A.length && b != B.length) {
            if (A[a] > B[b]) {
                merge[temp] = B[b++];
            } else {
                merge[temp] = A[a++];
            }
            temp++;
        }
        if (a != A.length) {
            while (a != A.length) {
                merge[temp++] = A[a++];
            }
        } else {
            while (b != B.length) {
                merge[temp++] = B[b++];
            }
        }
        return merge;
    }

    /**
     * 题目更新之后
     * @param nums1 数组1
     * @param m 数组1长度
     * @param nums2 数组2
     * @param n 数组2长度
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newarray = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            newarray[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < m) {
            newarray[k++] = nums1[i++];
        }
        while (j < n) {
            newarray[k++] = nums2[j++];
        }
        for (int l = 0; l < newarray.length; l++) {
            nums1[l] = newarray[l];
        }
    }
}
