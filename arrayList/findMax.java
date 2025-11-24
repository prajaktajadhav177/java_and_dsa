import java.util.*;
class FindMax{

	public static void main(String[] args){
		int max=Integer.MIN_VALUE;

		ArrayList<Integer> list1= new ArrayList<>();

		list1.add(9);
		list1.add(92);
		list1.add(29);
		list1.add(89);
		list1.add(90);
		list1.add(6);

		for(int i=0;i<=list1.size()-1;i++){
			//if(list1.get(i)>=max){
			//	max=list1.get(i);

			//}

			max=Math.max(max,list1.get(i));
		}

		System.out.println("Max element is : "+ max);
	
	}
}
