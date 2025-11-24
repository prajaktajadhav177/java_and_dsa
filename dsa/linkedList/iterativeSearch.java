class IterativeSearch{

	public static void main(String[] args){
	
		IterativeSearch s1=new IterativeSearch();
		s1.addFirst(199);
		s1.addFirst(14);
		//s1.addFirst(15);
		//s1.addFirst(21);
		//s1.printLinkedList();
		System.out.println(s1.iterativeSearch(14));
		System.out.println(s1.iterativeSearch(23));
		

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
			return ;
		}

		newNode.next=head;
		head=newNode;
		
	}

	public int iterativeSearch(int key){
		if(head==null){
			System.out.println("Empty!");	
			return -1;
		}
		Node temp=head;
		int i=0;
		while(temp!=null){
			if(temp.data==key){
			
				return i;
			}
			i++;
			temp=temp.next;
		}
		return -1;
	}

	public void printLinkedList(){
		
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}

		 System.out.println();
	}
}
