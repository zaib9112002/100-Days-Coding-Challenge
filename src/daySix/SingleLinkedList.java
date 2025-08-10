package daySix;
	// 2 task to insert and to delete at nth position
public class SingleLinkedList {
	public static void main(String[] args) {
	SLL s =new SLL();
	
	s.insertAtNthPosition(10, 0);
    s.insertAtNthPosition(20, 1);
    s.insertAtNthPosition(30, 2);
    s.insertAtNthPosition(5, 0);
    System.out.println("Single Linked List:");
    s.display(); // prints: 5 10 20 30

    s.insertAtNthPosition(25, 3);
    System.out.println("\nAfter inserting 25 at position 3:");
    s.display(); // prints: 5 10 20 25 30

    s.deleteFromNthPosition(2);
    System.out.println("\nAfter deleting node from position 2:");
    s.display(); // prints: 5 10 25 30
	}
}

class Node{
	//creating Node with value and next pointer
	int data;
	Node next; 
	//Initializing through constructor
	public Node(int data ){
		this.data = data;
		this.next = null;
	}
}
class SLL{
	private Node root;
	public SLL() {
		this.root =null;
	}

	/*
	 * //inserting a new node 
	 * public void addnewNode(int data) { Node n =new
	 *  Node(data); //check if SLL is empty 
	 *  if(this.root == null) { this.root = n;//insert root node 
	 *  return; 
	 *  } //sll is not empty 
	 *  Node temp = this.root;
	 * while(temp.next != null) { temp = temp.next; }
	 * temp.next = n; //new node added here }
	 */	
	
	//display method 
	public void display() {
		Node temp = this.root;
		while(temp != null) { //to reach upto Last node
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println();
		}
	
	// Method to insert a new node at the nth position
	public void insertAtNthPosition(int data, int n) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}
		if (n == 0) {
			newNode.next = root;
			root = newNode;
			return;
		}
	    Node current = root;
	    int currentIndex = 0;
	    while (currentIndex < n - 1 && current.next != null) {
	        current = current.next;
	        currentIndex++;
	    }
	    if (currentIndex != n - 1) {
	        System.out.println("Position out of bounds");
	        return;
	    }
	    newNode.next = current.next;
	    current.next = newNode;
	}

	// Method to delete a node from the nth position
	public void deleteFromNthPosition(int n) {
	    if (root == null) {
	        System.out.println("List is empty");
	        return;
	    }
	    if (n == 0) {
	    	root = root.next;
	        return;
	    }
	    Node current = root;
	    int currentIndex = 0;
	    while (currentIndex < n - 1 && current.next != null) {
	        current = current.next;
	        currentIndex++;
	    }
	    if (currentIndex != n - 1 || current.next == null) {
	        System.out.println("Position out of bounds");
	        return;
	    }
	    current.next = current.next.next;
	}
}
