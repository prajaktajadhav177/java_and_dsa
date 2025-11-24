import java.util.*;

class LinkedList{
	public static void main(String[] args){
	LinkedList ll= new LinkedList();

	ll.addFirst(6);	
	 ll.addFirst(5);
	  ll.addLast(9);
	   ll.addLast(8);

	   
	  System.out.println(findMid(head).data);
	}

	public static Node head;
	public static Node tail;
	
	public static class Node{
		int data;
		Node next;

		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public static void addFirst(int data){
		Node newNode= new Node(data);

		if(head==null){
			head=tail=newNode;
			return;
		}

		newNode.next=head;
		head=newNode;
	}

	public static void addLast(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=tail=newNode;
			return;
		}

		tail.next=newNode;
		tail=newNode;
	}

	public static Node findMid(Node head){
		Node slow=head;
		Node fast=head;

		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;

		}

		
		return slow;


		
	}

}
