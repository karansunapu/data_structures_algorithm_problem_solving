package leet_code.Top_Interview_Questions.Easy;

public class Maximum_Depth_of_Binary_Tree_104 {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.right = two;
        two.left = three;
        System.out.println(maxDepth(one));

    }
    public static int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh, rh) +1;

    }
}
