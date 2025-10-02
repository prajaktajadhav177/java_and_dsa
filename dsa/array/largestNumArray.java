import java.util.*;
class LargestNumber{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter Size of Array:");
                int size=sc.nextInt();
                int largestNum=0;
                int numbers[]=new int[size];
                for(int i=0;i<size;i++){
                                System.out.print("Enter elment at index"+ i +":");
                                numbers[i]=sc.nextInt();
        		}
        
                for(int i=0;i<numbers.length;i++){
                        if(largestNum<numbers[i]){
                                largestNum=numbers[i];
                        }
                       
                }
		System.out.println("Largest number is :"+ largestNum);
        }
}
