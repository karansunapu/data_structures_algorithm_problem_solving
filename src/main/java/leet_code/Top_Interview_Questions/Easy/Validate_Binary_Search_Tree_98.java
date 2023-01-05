package leet_code.Top_Interview_Questions.Easy;

public class Validate_Binary_Search_Tree_98 {
    public static void main(String[] args) {
        System.out.println(isValidBST(new TreeNode(10)));
    }

    public static boolean isValidBST(TreeNode root) {
//        return isValidInorderBST(root, null);
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(TreeNode root, int min, int max) {
        if (root == null)   return true;

        if (root.val>=min && root.val<=max){
            return isValidBSTHelper(root.left, min, root.val-1)
                    && isValidBSTHelper(root.right, root.val+1, max);
        }
        return false;
    }


    // Only for distinct elements
    private static boolean isValidInorderBST(TreeNode root, TreeNode prev) {
        if (root == null)
            return true;
        if (!isValidInorderBST(root.left, prev))
            return false;
        if (prev!=null && prev.val>=root.val)
            return false;
        prev = root;
        return isValidInorderBST(root.right, prev);
    }
}
