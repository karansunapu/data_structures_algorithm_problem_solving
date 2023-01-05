package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.Easy.TreeNode;

public class Populating_Next_Right_Pointers_in_Each_Node_116 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public static void main(String[] args) {
        System.out.println(connect(new Node(10)));
    }

    public static Node connect(Node root) {
        if (root == null) return null;
        Node cur = root, temp=null;
        while (cur.left != null){
            temp = cur;
            while (temp != null){
                temp.left.next = temp.right;
                if (temp.next != null)
                    temp.right.next = temp.next.left;

                temp = temp.next;
            }
            cur = cur.left;
        }
        return root;
    }
}
