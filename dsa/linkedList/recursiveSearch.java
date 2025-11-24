class RecursiveSearch{
	public static void main(String[] args){
		RecursiveSearch s1=new RecursiveSearch();
		s1.addFirst(1);
		s1.addFirst(71);
		s1.addFirst(91);
		System.out.println(s1.recSearch(91,head));
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

		if(head==null){
			head=tail=newNode;
			return;
		}

		newNode.next=head;
		head=newNode;
	}
	
	
	
	public int recSearch(int key, Node head){
		
	if(head==null){
	return -1;
	}

	if(head.data==key){
		return 0;
	}


	int indx=recSearch(key, head.next);
	if(indx==-1){
	return -1;
	}
	return indx+1;
	}

}
