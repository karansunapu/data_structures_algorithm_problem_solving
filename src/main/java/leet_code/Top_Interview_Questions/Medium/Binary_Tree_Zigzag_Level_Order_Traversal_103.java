package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.Easy.TreeNode;

import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal_103 {
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

        System.out.println(zigzagLevelOrder(three));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        int level=0;
        if (root==null) return list;

        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i=0; i<levelSize; i++){
                TreeNode node = queue.remove();
                subList.add(node.val);
                if (level == 0){
                    if (node.right != null)
                        queue.add(node.right);
                    if (node.left != null)
                        queue.add(node.left);
                } else {
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
            }
            list.add(subList);
            level++;
        }
        return list;
    }
}
