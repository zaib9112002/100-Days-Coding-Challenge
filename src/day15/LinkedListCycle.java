package day15;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {        // cycle detected
                return true;
            }
        }
        return false; // no cycle
    }
    public static void main(String[] args) {
        LinkedListCycle obj = new LinkedListCycle();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Case 1: No cycle
        System.out.println("Cycle detected? " + obj.hasCycle(head)); // false

        // Case 2: Create a cycle (5 -> 2)
        head.next.next.next.next.next = head.next; //main line of code
        System.out.println("Cycle detected? " + obj.hasCycle(head)); // true
    }
}
