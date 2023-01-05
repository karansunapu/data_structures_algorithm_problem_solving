package advanced.Linked_List_1;

public class Merge_two_ll {
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
        ListNode list1 = null;
        list1 = insertAtTail(list1, new ListNode(1));
        list1 = insertAtTail(list1, new ListNode(2));
        list1 = insertAtTail(list1, new ListNode(4));
        ListNode list2 = null;
        list2 = insertAtTail(list2, new ListNode(1));
        list2 = insertAtTail(list2, new ListNode(3));
        list2 = insertAtTail(list2, new ListNode(4));

        System.out.println(list1.toString() + "\n\n");
        System.out.println(list2.toString() + "\n\n");

        System.out.println(mergeTwoLists(list1, list2).toString());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newwNode = new ListNode(10);
        ListNode tail = newwNode;

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }

        if (list1!= null){
            tail.next = list1;
        }
        if (list2!= null){
            tail.next = list2;
        }

        System.out.println(newwNode);

        return newwNode.next;
    }
}
