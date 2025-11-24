import java.util.*;

class MultiDimentionalArrayList{
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(91);
		list1.add(31);
		list1.add(18);
		list1.add(21);
		//mainList.add(list1);

		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(65);
		list2.add(78);
		list2.add(94);
		list2.add(87);

		//mainList.add(list2);

		//System.out.println(mainList);

		ArrayList<Integer> list3=new ArrayList<>();
		ArrayList<Integer> list4=new ArrayList<>();
		ArrayList<Integer> list5=new ArrayList<>();

		for(int i=1;i<=5;i++){
			
			list3.add(i*1);
			list4.add(i*2);
			list5.add(i*4);		

		}

		mainList.add(list3);
		mainList.add(list4);
		mainList.add(list5);

		System.out.println(mainList);
		
		for(int i=0;i<mainList.size();i++){
		
			ArrayList<Integer> currentList= mainList.get(i);

			for(int j=0;j<currentList.size();j++){
				System.out.print(currentList.get(j)+" ");
				}
			System.out.println();
		}

	}
}


