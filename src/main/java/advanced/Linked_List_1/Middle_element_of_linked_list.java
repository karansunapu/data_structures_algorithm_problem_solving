package advanced.Linked_List_1;

public class Middle_element_of_linked_list {
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
        System.out.println(solve(head));

    }

    public static int solve(ListNode A) {
        if (A.next.next==null)
            return A.next.val;
        ListNode cur=A, sec_pntr=A;
        while (sec_pntr!=null && sec_pntr.next!=null){
            cur = cur.next;
            sec_pntr = sec_pntr.next.next;
        }
        return cur.val;
    }
}
