package leet_code.Top_Interview_Questions.Easy;

import java.util.ArrayList;
import java.util.List;

public class inorderTreeTraversal_94 {
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
        System.out.println(inorderTraversal(one));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list  = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public static void inorder(TreeNode root, List list){
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
