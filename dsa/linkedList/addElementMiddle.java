class LinkedList{
	public static void main(String[] args){
	
		LinkedList ll=new LinkedList();
		ll.addFirst(8);
		ll.addFirst(7);
		ll.addLast(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.add(2,90);
		ll.printLinkedList();
		System.out.println(ll.size);
		
	}

	public static Node head;
	public static Node tail;
	public static int size;

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

	public void add(int indx,int data){
		if(indx==0){
			addFirst(data);
			return;
		}
		int i=0;
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		while(i<indx-1){
			temp=temp.next;
			i++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	
	public void printLinkedList(){
	
	if(head==null){
	System.out.println("Linked List is Empty!");
	return;
	}	
	Node temp=head;
	while(temp !=null){
		System.out.print(temp.data+" ");
		temp=temp.next;		
	}

	System.out.println();
	
}




}
