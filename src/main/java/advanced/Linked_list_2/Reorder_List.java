package advanced.Linked_list_2;

public class Reorder_List {
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
        for (int i=1; i<=6; i++){
            ListNode node = new ListNode(i);
            A = insertAtTail(A, node);
        }

        System.out.println(A.toString() + "\n\n");
        System.out.println(reorderList(A));

    }

    public static ListNode reorderList(ListNode A) {
        ListNode head=A, fast=A, slow=A, mid=null, new_node=null, cur=null, temp=null;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        cur = mid = slow.next;
        slow.next = null;
        while (cur!=null){
            temp = cur.next;
            cur.next = new_node;
            new_node = cur;
            cur = temp;
        }
        mid = new_node;
        cur = head;
        // to handle exceptions
        ListNode dummy_node = new ListNode(9);
        ListNode tail = dummy_node;
        while (mid!=null){
            tail.next = cur;
            temp = cur.next;
            cur.next = mid;
            tail = mid;
            mid = mid.next;
            cur = temp;
        }
        tail.next = cur;

        return dummy_node.next;
    }
}
