package dayFour;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue
		MyQueue q = new MyQueue(5);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.deque();
		q.isFull();
		q.enque(100);
		q.display();
}

}
class MyQueue{
	
	private int[] q;
	private int front;
	private int rear;
	private int capacity;
	
	public MyQueue(int capacity) {
	q =new int[capacity];
	this.capacity = capacity;
	front = 0; // indicates empty queue
	rear = 0;
	}
	public void enque(int ele) {
	if(isFull()==true) {
		System.out.println("Queue is Full,try later");
		return;
	}
	q[rear++]=ele;  //first q[rear] is added element then rear increments
	System.out.println("added element successfully");
	}
	
	public int deque() {
	if(front==rear) {
		return -1;
	}
	return q[front];
	}
	
	public boolean isFull() {
	if(rear==capacity) {
		System.out.println("full");
		return true;
	}
	return false;
	}
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<rear;i++) {
			System.out.print(q[i]+" ");
		}
	}
}