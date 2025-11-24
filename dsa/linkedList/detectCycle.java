class DetectCycle{

	public static void main(String[] args){
	
	DetectCycle s1=new DetectCycle();
//	s1.addFirst(5);
//	s1.addLast(1);
//	s1.addFirst(6);
//	s1.addFirst(4);
//	s1.addFirst(3);
//	s1.addFirst(9);
//	s1.printLinkedList();

	head=new Node(1);
	head.next=new Node(9);
	head.next.next=new Node(8);
	 head.next.next.next=head;
	System.out.println(s1.isCycle());
	if(isCycle()){
		rmCycle();
	}

	 System.out.println(s1.isCycle());
	}

	public static Node head;
	public static Node tail;

static class Node{
		int data;
		Node next;

		public Node(int data){

			this.data=data;
			this.next=null;
		}
	}

	public void addFirst(int data){
		Node newNode=new Node(data);
	       if(head==null){
	       	head=tail=newNode;
		return;
	       }	

	       newNode.next=head;
		head=newNode;
	}

	public void addLast(int data){
	Node newNode=new Node(data);

	if(head==null){	
		head=tail=newNode;
	return;	
	}
	tail.next=newNode;
	tail=newNode;
	
	}

	public static boolean isCycle(){
	
		Node slow=head;
		Node fast=head;
		while(fast!=null && slow != null){
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast){
				return true;
			}
		
		}
		return false;
	}

	
	public static void rmCycle(){
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && slow != null){
		
			 Node prev=fast;
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				slow=head;
				slow=slow.next;
				fast=fast.next;

				if(slow==fast){
					prev.next=null;
					System.out.println("Cycle removed");
					return;
				
				}

				  
			}
					
	}
	 System.out.println("No Cycle Found");
	}

	public void printLinkedList(){
		if(head==null){
			System.out.println("Empty");
			return;
		}

		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}

}
