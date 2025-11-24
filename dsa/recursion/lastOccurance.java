class LastOccurance{
	public static void main(String[] args){
	int key=11;
	int arr[]={1,2,36,10,45,78,10,10};
	System.out.println(occurance(arr,key,0));
	}
	
	public static int occurance(int arr[], int key, int i){
		
		if(arr.length==i){
			return -1;
		
		}
		
		int isFound=occurance(arr,key,i+1);
		if(isFound != -1){
		return isFound;
		
		}
		if(arr[i] == key){
			
			return i;
		}
		return isFound;
	}
}
