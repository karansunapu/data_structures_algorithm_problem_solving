package advanced.Linked_List_1;

import java.util.List;

public class Delete_middle_node_of_a_Linked_List {
    static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }

        @Override
        public String toString() {
            return val + " -> " + next;
        }
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
        for (int i=1; i<=2; i++){
            ListNode node = new ListNode(i);
            head = insertAtTail(head, node);
        }

        System.out.println(head.toString() + "\n\n");
        System.out.println(solve(head));

    }

    public static ListNode solve(ListNode A) {
        ListNode head = A;                      // CHECK-1. secure head

        if (A== null || A.next==null)           // 0 or 1 elements
            return null;

        if (A.next.next == null){               // only 2 elements
            A.next=null;
            return A;
        }

        ListNode cur=A, prev=null, sec_pntr=A;
        while (sec_pntr!=null && sec_pntr.next!=null){   // CHECK-2. check NUll PE (.)dots
            prev = cur;
            cur = cur.next;
            sec_pntr = sec_pntr.next.next;
        }

        prev.next = cur.next;
        cur.next = null;

        return head;
    }
}
