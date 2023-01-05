package advanced.Linked_List_1;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Reverse_Link_List_II_B_to_C {
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

        int B=2, C=4;
        System.out.println(reverseBetween(A, B, C));

    }

    public static ListNode reverseBetween(ListNode A, int B, int C) {
        int pos=1;
        ListNode head = A;

        ListNode prev=null, cur=A, new_node=null, tail=null, temp=null;
        while (pos != B){
            prev = cur;
            cur = cur.next;
            pos++;
        }
        while (pos != C+1){
            temp = cur.next;
            cur.next = new_node;
            new_node = cur;
            if (tail == null)
                tail = new_node;
            cur = temp;
            pos++;
        }
        tail.next = cur;
        if (prev != null)
            prev.next = new_node;

        return head;
    }
}
