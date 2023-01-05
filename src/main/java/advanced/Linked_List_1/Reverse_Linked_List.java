package advanced.Linked_List_1;

public class Reverse_Linked_List {
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
        System.out.println(reverseList(head));

    }

    public static ListNode reverseList3Pointers(ListNode A) {
        ListNode head=A, prev=null, cur=A, temp=A;
        while (cur!=null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static ListNode reverseList(ListNode A) {
        ListNode head=A, new_node=null, cur=A, temp=A;
        while (cur!=null){
            temp = cur.next;
            cur.next = new_node;
            new_node = cur;
            cur = temp;
        }
        return new_node;
    }
}
