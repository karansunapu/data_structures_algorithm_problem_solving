package leet_code.Top_Interview_Questions.Easy;

public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
       return sortedArrayToBST_Helper(nums, 0, nums.length-1);
    }

    private static TreeNode sortedArrayToBST_Helper(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int mid = (start+end)/2;
        TreeNode node = new TreeNode(mid);
        node.left = sortedArrayToBST_Helper(nums, start, mid-1);
        node.right = sortedArrayToBST_Helper(nums, mid+1, end);

        return node;
    }
}
