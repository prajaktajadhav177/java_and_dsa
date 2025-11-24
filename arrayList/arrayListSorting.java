import java.util.ArrayList;
import java.util.Collections;

class ArrayListSorting{

	public static void main(String[] args){
	
		ArrayList<Integer> list1=new ArrayList<>();

		list1.add(3);
		list1.add(8);
		list1.add(1);
		list1.add(9);
		list1.add(5);
		list1.add(0);

		System.out.println(list1);

		Collections.sort(list1);
	
		System.out.println(list1);

		Collections.sort(list1,Collections.reverseOrder());

		System.out.println(list1);
	}
}
