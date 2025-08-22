package day19;

public class SortedLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(8);
        list.insert(1);
        list.insert(4);

        System.out.println("Sorted Linked List:");
        list.printList();

        list.delete(3);

        System.out.println("After deleting 3:");
        list.printList();
    }
}

/*
 * Output:
 *  
 * Sorted Linked List: 
 * 1 3 4 5 8 
 * After deleting 3:
 *  1 4 5 8
 */