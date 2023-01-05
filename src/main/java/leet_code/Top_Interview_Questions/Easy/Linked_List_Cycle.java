package leet_code.Top_Interview_Questions.Easy;

import java.util.List;

public class Linked_List_Cycle {
    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return val + " -> " + next;
        }
    }

    static ListNode insertAtTail(ListNode head, ListNode node) {
        if (head == null)
            return node;                    // first node

        ListNode temp = head;
        while (temp.next != null)           // go to last
            temp = temp.next;
        temp.next = node;                   // add at last

        return head;                        // return head
    }

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA, b=headB;
        int aSize=0, bSize=0;
        while (a != null){
            aSize++;
            a = a.next;
        }
        while (b != null){
            bSize++;
            b = b.next;
        }
        b=headB; a=headA;
        if (aSize < bSize){
            for (int i=0; i< (bSize-aSize); i++)
                b = b.next;
        } else {
            for (int i=0; i< (aSize-bSize); i++)
                a = a.next;
        }

        while (b != null){
            if (a==b)
                return a;
            a = a.next;
            b = b.next;
        }
        return null;

    }
}