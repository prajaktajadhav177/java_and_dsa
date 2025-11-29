import java.util.*;

class StackDemo{

	public static void main(String[] args){
		
		Stack<Integer> s1=new Stack<>();
		s1.push(6);
		s1.push(8);
		s1.push(9);
	
		while(!s1.isEmpty()){
			System.out.println(s1.peek());
			s1.pop();
		}
	}
}
