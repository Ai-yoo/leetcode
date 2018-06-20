package dp;

/**
 * Created with IDEA
 *
 * 走棋盘问题，3*7
 *
 * @author duzhentong
 * @Date 2018/6/20
 * @Time 16:20
 */
public class Practice62 {
    public static void main(String[] args) {
        System.out.println(path(3, 7));
        System.out.println(path1(3, 7));
    }

    public static int path(int m, int n) {
        if (n < 0 || m < 0) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        return path(m - 1, n) + path(m, n - 1);
    }

    public static int path1(int m, int n) {
        int[][] w = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    w[i][j] = 1;
                } else {
                    w[i][j] = w[i - 1][j] + w[i][j - 1];
                }
            }
        }
        return w[m - 1][n - 1];
    }
}
