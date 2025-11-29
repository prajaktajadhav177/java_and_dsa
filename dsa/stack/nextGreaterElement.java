
import java.util.*;
// class NextGreaterElement{
//         public static void main(String[] args){
//
//                 int arr[]={6,8,0,1,3};
//
//                 int arr1[]=new int[arr.length];
//
//                 Arrays.fill(arr1,-1);
//
//                 checkGreaterElement(arr,arr1);
//                 for(int i=0;i<arr1.length;i++){
//                         System.out.println(arr1[i]+" ");
//                 }
//         }
//
//         public static void checkGreaterElement(int arr[], int arr1[]){
//
//
//
//                 for(int i=0;i<arr.length;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[i]<arr[j]){
//                                         arr1[i]=arr[j];
//                                 break;
//                         }
//
//
//                 }
//         }
//
//         }
//
// }

class NextGreaterElement{
	public static void main(String[] args){
	
	
		int arr[]={6,8,0,1,3};
		int nextGre[]=new int[arr.length];
		
		Stack<Integer> s=new Stack<>();
			

		System.out.println();

		for(int i=arr.length-1;i>=0;i--){
			while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
                        nextGre[i]=-1;
                }else{
                        nextGre[i]=arr[s.peek()];
                }
		s.push(i);
		}

		   for(int i=0;i<nextGre.length;i++){
                         System.out.println(nextGre[i]+" ");



                }

	}

	
	
}
