class LargestNum{
	public static int LargestNumber(int arr[], int key){

	for(int i=0;i<arr.length;i++){
	if(arr[i]>key){
	
		key=arr[i];
	}

	}
	return key;
	}
	public static void main(String[] args){
	
	int arr[]={-1,-2,-6,-3,-5};
	int key=Integer.MIN_VALUE;
	int ans=LargestNumber(arr , key);
	System.out.println("Largest Number is :"+ans);
	
	
	}
}
