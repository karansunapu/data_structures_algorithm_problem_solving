package leet_code.Top_Interview_Questions.Easy;

public class Symmetric_Tree_101 {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.right = two;
        two.left = three;
        System.out.println(isSymmetric(one));

    }

    public static boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelper(root.left, root.right);
    }

    private static boolean isSymmetricHelper(TreeNode left, TreeNode right) {

        if (left==null || right==null)
            return left==right;
        if (left.val != right.val)
            return false;

        return isSymmetricHelper(left.left, right.right) &&
                isSymmetricHelper(left.right, right.left);
    }
}
