import java.util.ArrayList;
class Solution{

	public static void main(String[] args){
	
		ArrayList<Integer> list1= new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
			
		System.out.println(list1);
		
		int element=list1.get(2);
		System.out.println(element);

		list1.set(2,10);
		System.out.println(list1);

		System.out.println(list1.contains(1));
                System.out.println(list1.contains(11));

		list1.remove(1);
		System.out.println(list1);

		list1.add(3,880);
		System.out.println(list1);
	
		System.out.println(list1.size());

		for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
	}
}
