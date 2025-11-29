 import java.util.*;

 class StackDemo{
 	public static void main(String[] args){
	
		Stack<Integer> s1=new Stack<>();
		s1.push(5);
		s1.push(7);
		s1.push(9);
		s1.push(1);

			pushAtBottom(s1,4);
		while(!s1.isEmpty()){
			System.out.println(s1.pop());
		}
	}

	
	public static void pushAtBottom(Stack<Integer> s1, int data){
	
		if(s1.isEmpty()){
		s1.push(data);
		return;
		}
		int top=s1.pop();
		pushAtBottom(s1,data);
		s1.push(top);
	
		
	}
 }
