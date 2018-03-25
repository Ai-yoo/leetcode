package tree;

/**
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/3/25
 * @Time 7:39
 */
public class Practice669 {
//    public static void main(String[] args) {
//        TreeNode a = new TreeNode(1);
//        TreeNode b = new TreeNode(0);
//        TreeNode c = new TreeNode(2);
//        a.left = b;
//        a.right = c;
//        System.out.println(new Practice669().trimBST(a, 1, 2).val);
//    }
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        else if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        else if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        root.right = trimBST(root.right, L, R);
        root.left = trimBST(root.left, L, R);

        return root;
    }
}

