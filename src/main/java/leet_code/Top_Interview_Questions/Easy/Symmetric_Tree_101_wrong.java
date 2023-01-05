package leet_code.Top_Interview_Questions.Easy;

import java.util.ArrayList;
import java.util.List;

/* wrong for
[1,2,2,2,null,2]

            1
        2       2
    2       2
 */

public class Symmetric_Tree_101_wrong {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.right = two;
        two.left = three;
        System.out.println(isSymmetric(one));
    }

    public static boolean isSymmetric(TreeNode root) {
        List<Integer> listLeft  = new ArrayList<>();
        inorderLeft(root, listLeft);
        List<Integer> listRight  = new ArrayList<>();
        inorderRight(root, listRight);

        if (listLeft.equals(listRight))
            return true;
        else
            return false;
    }

    public static void inorderLeft(TreeNode root, List list){
        if (root == null)
            return;
        inorderLeft(root.left, list);
        list.add(root.val);
        inorderLeft(root.right, list);
    }

    public static void inorderRight(TreeNode root, List list){
        if (root == null)
            return;
        inorderRight(root.right, list);
        list.add(root.val);
        inorderRight(root.left, list);
    }



}
