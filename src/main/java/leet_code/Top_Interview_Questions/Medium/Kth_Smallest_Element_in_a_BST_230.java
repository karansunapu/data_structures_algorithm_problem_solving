package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.Easy.TreeNode;

public class Kth_Smallest_Element_in_a_BST_230 {
    public static void main(String[] args) {
        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        three.left = nine;
        three.right = twenty;

        twenty.left = fifteen;
        twenty.right = seven;

        System.out.println(kthSmallest(three, 3));

    }

    private static int number = 0;
    private static int count = 0;

    public static int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }

    public static void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        count--;
        if (count == 0) {
            number = n.val;
            return;
        }
        if (n.right != null) helper(n.right);
    }
}
