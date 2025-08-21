package day17;

public class DoublyLinkedList {
	// Node definition
	    class Node {
	        int data;
	        Node prev, next;
	        Node(int d) {
	            data = d;
	            prev = next = null;
	        }
	    }

	    Node head = null;

	    // Insert at end
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    // Display forward
	    public void displayForward() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    // Display backward
	    public void displayBackward() {
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.prev;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.displayForward();   // 10 <-> 20 <-> 30 <-> null
	        list.displayBackward();  // 30 <-> 20 <-> 10 <-> null
	    }
	}
