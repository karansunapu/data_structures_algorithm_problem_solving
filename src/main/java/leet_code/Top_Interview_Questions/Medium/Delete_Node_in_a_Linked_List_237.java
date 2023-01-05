package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.utility.ListNode;

public class Delete_Node_in_a_Linked_List_237 {
    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node) {
        ListNode second = node.next;
        node.val = second.val;
        node.next = second.next;
        second.next =null;
    }
}
