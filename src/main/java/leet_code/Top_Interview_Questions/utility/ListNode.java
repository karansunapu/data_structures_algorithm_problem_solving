package leet_code.Top_Interview_Questions.utility;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return val + " -> " + next;
    }
}
