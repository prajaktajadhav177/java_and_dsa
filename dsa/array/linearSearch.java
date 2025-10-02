import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array:");
		int size=sc.nextInt();
		System.out.print("Enter key to search:");
		int key=sc.nextInt();
		int numbers[]=new int[size];
		for(int i=0;i<size;i++){
				System.out.print("Enter elment at index "+ i +":");
				numbers[i]=sc.nextInt();
			}
		int index=linearSearch(numbers,key);
 		if(index==-1){
		System.out.println("Key not found");
		}
		else{
		System.out.println("Element is at index : "+index);
		}
	}
	public static int linearSearch(int numbers[],int key){
		for(int i=0;i<numbers.length;i++){
			if(key==numbers[i]){
				return i;
			}
			
		}
		return -1;
	}
}
