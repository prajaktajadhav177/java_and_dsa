import java.util.*;
class SwapNum{

	public static void main(String[] args){
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(8);
		
		System.out.println(list1);

		swap(list1,1,3);
	       
	       	System.out.println(list1);
	}

	public static void swap(ArrayList<Integer> list1,int indx1, int indx2){
	
		int temp=list1.get(indx1);
		list1.set(indx1,list1.get(indx2));		
		list1.set(indx2,temp);
	}
}	
