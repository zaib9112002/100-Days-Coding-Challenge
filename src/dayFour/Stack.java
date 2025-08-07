package dayFour;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Stack follow LIFO architecture with all Functions
		
		
		MyStack m=new MyStack(4); //gives capacity	
		  m.push(100); m.push(200); //takes input value to add
		  m.push(5);//overflows when capacity=2
		 
	//	  int element=m.pop();
	//	  System.out.println("pop function:- Reading top element and then removing"+element); //reads top element 200
	//	  System.out.println("pop:-"+m.pop()); //reads element 100 System.out.println(m.pop());
			  //Stack Under flow and prints -1
			 
		//when capacity=4 
		//displays top element as Top element is 5
		  
		  m.peek(); 
		  
		  //to know how many are filled in a capacity use size()
		 System.out.println("size of a stack filled is: "+m.size());
		 
		 m.display();
		
	
		
	}

}

class MyStack {
	private int[] stack;
	private int capacity;
	private int top;
	
	public MyStack(int capacity) {
		this.stack=new int[capacity];
		this.top=-1;
		this.capacity = capacity;
	}
	
	public void push(int i) {
		// TODO Auto-generated method stub
		if(top==capacity-1) {
			System.out.println("Push :- Stack OverFlow");
			return;
		}
		stack[++top]=i;
		System.out.println("Push:-Element inserted "+i);
	}
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty() == true) {
			System.out.println("Pop:- Stack Under flow");
			return -1;
		}int ele =stack[top--];
		return ele;
	}
	
	//check if stack is empty then display Stack underFlow
	//else display top element
	public void peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Peek:- Stack UnderFlow");	
			}
		else {
			System.out.println("Peek:-Top element is "+stack[top]);
			
		}
		
	}
	//check stack is empty or not 
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	
	//gives number of elements filled in a stack
	public int size() {
		return top+1;
	}
	
	//reading elements in a loop
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
}

