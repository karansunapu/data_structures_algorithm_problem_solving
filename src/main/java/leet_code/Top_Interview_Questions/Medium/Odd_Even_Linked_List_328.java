package leet_code.Top_Interview_Questions.Medium;

import leet_code.Top_Interview_Questions.utility.ListNode;

public class Odd_Even_Linked_List_328 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for (int i=2; i<=5; i++){
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
        }
        tail.next = null;
        System.out.println(head);

        System.out.println(oddEvenList(head));
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode newLL = new ListNode(10), odd=head, even, newTail=newLL;
        while (odd.next!=null && odd.next.next!=null){
            even = odd.next;
            odd.next = odd.next.next;
            odd = odd.next;
            newTail.next = even;
            newTail = newTail.next;
        }

        newTail.next= odd.next;
        odd.next = newLL.next;
        return head;
    }
}
