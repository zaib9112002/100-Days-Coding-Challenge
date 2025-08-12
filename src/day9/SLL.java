package day9;

// Node class representing a single node in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with methods to add nodes and delete n-th node from last
class LinkedList {
    Node head;

    // Method to add a new node at the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to delete n-th node from last
      public void deleteNthNodeFromLast(int n) {
        // Initialize two pointers
        Node first = head;
        Node second = head;

        // Move the second pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (second == null) {
                return; // n is greater than the length of the list
            }
            second = second.next;
        }

        // If second is null, it means we need to delete the head
        if (second == null) {
            head = head.next;
            return;
        }

        // Move both pointers until second reaches the end
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        // Delete the n-th node from last
         first.next = first.next.next;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Original List:");
        list.printList(); // prints: 1 2 3 4 5

        list.deleteNthNodeFromLast(2);

        System.out.println("List after deleting 2nd node from last:");
        list.printList(); // prints: 1 2 3 5
    }
}