import java.util.*;

class QueueLL{
	public static void main(String[] args){
		Queue q=new Queue();
		 q.add(1);q.add(2);q.add(3);

		 //System.out.println(q.remove());
		 //q.add(4);
		 //System.out.println(q.remove());
		 q.add(5);
		 while(!q.isEmpty()){
		 	System.out.println(q.peek());
			q.remove();
		 }
		
	}

static class Node{
		
		int data;
		Node next;

		public Node(int data){
			
			this.data=data;
			this.next=null;
		}

	}

	static class Queue{
	public static Node head;
        public static Node tail;
	
	public static boolean isEmpty(){
		return head==null && tail==null;
	}

	public static void add(int data){
		Node newNode =new Node(data);
		if(head==null){
		tail=head=newNode;
		return;	
		}
		tail.next=newNode;
		tail=newNode;
	}

	public static int remove(){
	
		if(isEmpty()){
			return -1;
		}

		int front=head.data;
		if(tail==head){

			tail=head=null;
		}
		else{
			head=head.next;
		}
		return front;

	}

	public static int peek(){
		if(isEmpty()){
			return -1;
		}

		return head.data;
	}
}
}
