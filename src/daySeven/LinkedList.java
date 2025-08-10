package daySeven;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglelinkedList sll = new SinglelinkedList();
		sll.addnewNode(100);
		sll.addnewNode(200);
		sll.addnewNode(300);
		sll.addnewNode(400);
		sll.addnewNode(500);
		System.out.println("Linkedlist in Order");
		sll.display();
		System.out.println("LinkedList in reverse order");
		sll.printReverse(sll.root);
	}

}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next = null;
	}
}
class SinglelinkedList{
	 Node root;
	public SinglelinkedList() {
		this.root =null;
	}
	public void addnewNode(int data) { 
		Node n =new Node(data); //check if SLL is empty 
		if(this.root == null) { 
			this.root = n;//insert root node 
			return; 
		} //sll is not empty 
		Node temp = this.root;
		while(temp.next != null) { 
		 temp = temp.next; 
		 }
		temp.next = n;
	 }
//display method 
	public void display() {
		Node temp = this.root;
		while(temp != null) { //to reach upto Last node
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println();
		}
	
	//to print reverse order
	public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next);
        System.out.print(node.data + " <- ");
    }
}