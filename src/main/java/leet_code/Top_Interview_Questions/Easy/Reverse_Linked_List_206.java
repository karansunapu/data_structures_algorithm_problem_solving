package leet_code.Top_Interview_Questions.Easy;

public class Reverse_Linked_List_206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        System.out.println(reverseList(new ListNode()));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode tail=null, nextP;
        while (head.next != null){
            nextP = head.next;
            head.next = tail;
            tail = head;
            head = nextP;
        }
        head.next = tail;
        return head;
    }
    
    
}
