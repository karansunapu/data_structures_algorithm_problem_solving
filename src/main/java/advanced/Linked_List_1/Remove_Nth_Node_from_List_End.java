package advanced.Linked_List_1;

public class Remove_Nth_Node_from_List_End {
    static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
        @Override
        public String toString() {return val + " -> " + next;}
    }

    static ListNode insertAtTail(ListNode head, ListNode node){
        if (head == null)
            return node;                    // first node

        ListNode temp=head;
        while (temp.next != null)           // go to last
            temp = temp.next;
        temp.next = node;                   // add at last

        return head;                        // return head
    }

    public static void main(String[] args) {
        ListNode head = null;
        for (int i=1; i<=6; i++){
            ListNode node = new ListNode(i);
            head = insertAtTail(head, node);
        }

        System.out.println(head.toString() + "\n\n");

        int B=2;
        System.out.println(removeNthFromEnd(head, B));

    }

    public static ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode f_pntr=A, cur=A, temp=null;
        return null;

    }
}
