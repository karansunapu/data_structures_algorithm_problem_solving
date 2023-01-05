package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.Easy.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_102 {
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

        System.out.println(levelOrder(three));
    }


/*

    // Not using null
    // at any level count number of nodes in queue
    // then  run loop for that many nodes


    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
    　　List<Integer> level = new ArrayList<>();
    　　int cnt = queue.size();
    　　for (int i = 0; i < cnt; i++) {
    　　　　TreeNode node = queue.poll();
    　　　　level.add(node.val);
    　　　　if (node.left != null) {
    　　　　　　queue.add(node.left);
    　　　　}
    　　　　if (node.right != null) {
    　　　　　　queue.add(node.right);
    　　　　}
　　   }
　　  res.add(level);
    }
    return res;
 */

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        int level=0;
        if (root==null) return list;

         // insert root and null -> null marks the end of the level
        queue.add(root); queue.add(null);
        while (queue.size()>1){
            TreeNode node = queue.remove();
            if (node == null){
                level++;
                queue.add(null);
            } else {
                try {
                    list.get(level).add(node.val);
                }
                catch (IndexOutOfBoundsException e){
                    list.add(new ArrayList<Integer>() {{ add(node.val); }}    );
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return list;
    }


}
