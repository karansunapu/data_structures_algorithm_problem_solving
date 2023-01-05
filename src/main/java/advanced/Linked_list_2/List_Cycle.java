package advanced.Linked_list_2;

import advanced.Linked_List_1.Reverse_Link_List_II_B_to_C;

public class List_Cycle {
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
        ListNode A = null;
        for (int i=1; i<=5; i++){
            ListNode node = new ListNode(i);
            A = insertAtTail(A, node);
        }

        System.out.println(A.toString() + "\n\n");

    }

    public static ListNode detectCycle(ListNode a) {
        ListNode head=a, slow=a, fast=a;
        // FIND LOOP OR NOT
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if (slow==fast)
                break;
        }

        if (fast==null && fast.next==null)
            return null;


        // FIND AND REMOVE THE LOOP
        fast = a;
        ListNode prev = slow;
        while (fast != slow){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
        return head;

        // LOOP -> return slow;

    }


}
