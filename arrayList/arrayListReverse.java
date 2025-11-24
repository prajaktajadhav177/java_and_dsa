import java.util.*;
class ReverseArrayList{
	public static void main(String[] args){
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(9);
		list1.add(8);            
		list1.add(7);
		list1.add(6);
		list1.add(5);
		list1.add(4);
		list1.add(3);

		for(int i=list1.size()-1;i>=0;i--){
			System.out.print(list1.get(i)+ " ");
		}

		System.out.println();
	}
}
