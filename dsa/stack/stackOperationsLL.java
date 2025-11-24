class StackUsingLL{

	public static void main(String[] args){
	
	StackUsingLL s1=new StackUsingLL();
	Stack s2=new Stack();
	s2.push(2);
	 s2.push(8);
	  s2.push(1);


	   System.out.println(s1);
	  while(!s2.isEmpty()){
	  	System.out.println(s2.peek());
		s2.pop();
	  }
	}
	
	public static class Node{
	
		int data;
		Node next;

	 Node(int data){
		
			this.data=data;
			this.next=null;
		}
	}

	static class Stack{

		static Node head=null;
	public static boolean isEmpty(){
		return head==null;
	}

	public static void push(int data){
		
		Node newNode=new Node(data);
		if(isEmpty()){
		head=newNode;
		return;
		}
		newNode.next=head;
		head=newNode;
	}

	public static int pop(){
		
		if(isEmpty()){
		return -1;
		}

		int top=head.data;
		head=head.next;
		return top;
		
	}

	public static int peek(){
		if(isEmpty()){
		return -1;
		}
		return head.data;
	}
	}
}
