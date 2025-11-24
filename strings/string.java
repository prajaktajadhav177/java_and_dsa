import java.util.*;
class StringBasic{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();  // takes one word still space will occur
		System.out.println(name);
		sc.nextLine();
		String address=sc.nextLine(); //read rest of the current line untill enter is pressed
		System.out.println(address);

	}
}
