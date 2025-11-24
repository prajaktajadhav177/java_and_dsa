import java.util.*;
class StackDemo{
	public static void main(String[] args){
		Stack s1=new Stack();
		s1.push(4);
		s1.push(5);

		while(!s1.isEmpty()){
			System.out.println(s1.peek());
			s1.pop();	
			
		}
	}

	static class StackOperation{
	
		static ArrayList<Integer> list=new ArrayList<>();

		public static boolean isEmpty(){
		
		return list.size()==0;
		}

		public static void push(int data){
			list.add(data);
		}

		public static int pop(){

			if(isEmpty()){
			return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}

		public static int peek(){

			 if(isEmpty()){
                        return -1;
                        }
			return list.get(list.size()-1);
		}
	}
	
}

