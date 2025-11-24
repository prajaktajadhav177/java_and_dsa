class LinkedList{
	public static void main(String[] args){
	
		LinkedList ll=new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
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

	public static void addLast(int data){
		Node newNode=new Node(data);
	       	if(head==null){
			head=tail=newNode;
			return;

		}
		tail.next=newNode;
		tail=newNode;	
		
	}



}
