package tree;

import java.util.HashSet;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/10
 * @Time 18:28
 */

/**
 * 给定一个二进制搜索树和一个目标编号，如果BST中存在两个元素，则它们的和等于给定目标，则返回true。

 例1：
 输入：
 五
 / \
 3 6
 / \ \
 2 4 7

 目标= 9

 输出：真
 例2：
 输入：
 五
 / \
 3 6
 / \ \
 2 4 7

 目标= 28

 输出：错误
 */
public class Practice653 {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(5);
        TreeNode B = new TreeNode(3);
        TreeNode C = new TreeNode(6);
        TreeNode D = new TreeNode(2);
        TreeNode E = new TreeNode(4);
        TreeNode F = new TreeNode(7);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        Practice653 pa = new Practice653();
        System.out.println(pa.findTarget(A, 9));
    }

    public boolean findTarget(TreeNode root, int k) {
        HashSet set = new HashSet();
        return dfs(root, set, k);
    }

    public boolean dfs(TreeNode root, HashSet set, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return dfs(root.left, set, k) || dfs(root.right, set, k);
    }
}
