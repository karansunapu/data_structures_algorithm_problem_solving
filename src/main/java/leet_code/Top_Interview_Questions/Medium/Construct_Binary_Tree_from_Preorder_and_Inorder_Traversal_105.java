package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.Easy.TreeNode;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        System.out.println(buildTree(preorder, inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart=0, preEnd=preorder.length-1, inStart=0, inEnd=inorder.length-1;
        return buildTreeHelper(preorder, inorder, preStart, preEnd, inStart, inEnd);
    }

    private static TreeNode buildTreeHelper(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart>preEnd)
            return null;

        TreeNode node = new TreeNode(preorder[preStart]);

        int idx=inStart;
        for (int i=inStart; i<=inEnd; i++){
            if (inorder[i] == preorder[preStart])
                idx=i;
        }

        int len = idx - inStart;
        node.left = buildTreeHelper(preorder, inorder, preStart+1, preStart+len,
                                                                inStart, idx-1);
        node.right = buildTreeHelper(preorder, inorder, preStart+len+1, preEnd,
                idx+1, inEnd);

        return node;
    }


}
