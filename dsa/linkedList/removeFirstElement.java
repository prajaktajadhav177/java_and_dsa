class RemoveFirstElement{
	public static void main(String[] args){
		RemoveFirstElement ll=new RemoveFirstElement();
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addLast(5);
		ll.addLast(7);
		ll.addFirst(90);
		
		ll.printLinkedList();
			ll.removeFirst();
		   ll.printLinkedList();	
	}

	public static Node head;
	public static Node tail;

	public class Node{
	
		int data;
		Node next;

		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public void addFirst(int data){
		Node newNode=new Node(data);
		size++;
		if(head==null){
			head=tail=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;

	}

	public void addLast(int data){
		
		Node newNode=new Node(data);
		size++;
		if(head==null){
			head=tail=newNode;
			return;
		}

		tail.next=newNode;
		tail=newNode;
	}

		public static int size=0;  

	public int removeFirst(){
		if(size==0){
			System.out.println("LL is Empty !");
			 return Integer.MIN_VALUE;
		}else if(size==1){
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
	
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	
	public void printLinkedList(){
		if(head==null){
			System.out.println("Linked List is Empty!");
			return;
		}
		
		Node temp=head;
		while(temp != null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	
	}
}
