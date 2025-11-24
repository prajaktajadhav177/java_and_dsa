class BackTrackArray{

	public static void main(String[] args){
	
		int arr[] = new int[5];
		 
		changeArr(arr,0,1);
		System.out.print("Subtracted  array: ");
		printArr(arr);
	}

	public static void printArr(int arr[]){
	
	for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]+ " ");
	
	}
	System.out.println();
	}

	public static void changeArr(int arr[],int i,int val){
	if(i==arr.length){
		System.out.print("First array: ");
		     printArr(arr);
		return;
	}		
	arr[i]=val;
	changeArr(arr,i+1,val+1);
	arr[i]=val-2; //Backtracking	
	}
}
