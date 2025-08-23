package day20;

 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
public class LinkedList {
    Node head;

    // Method to merge two sorted linked lists
    public Node mergeLists(Node head1, Node head2) {
        // Create a dummy node
        Node dummy = new Node(0);
        Node current = dummy;

        // Merge smaller nodes first
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, append them
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }

        return dummy.next;
    }

    // Method to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create the first linked list: 1 -> 3 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // Create the second linked list: 2 -> 4 -> 6
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("Linked List 1:");
        list.printList(head1);

        System.out.println("Linked List 2:");
        list.printList(head2);

        // Merge the two linked lists
        Node mergedHead = list.mergeLists(head1, head2);

        System.out.println("Merged Linked List:");
        list.printList(mergedHead);
    }
}

/*
Output:
Linked List 1:
1 3 5 
Linked List 2:
2 4 6 
Merged Linked List:
1 2 3 4 5 6 

*/