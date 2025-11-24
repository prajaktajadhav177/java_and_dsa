class FirstOccurance{
	public static void main(String[] args){
		int key=1;
		int arr[] = {1,2,3,4,5,6,55555};
		System.out.println(occurance(arr,key,0));
	}

	public static int occurance(int arr[] ,int  key, int i){
	
		if(arr.length-1==i){
		return -1;
		
		}

		if(arr[i]==key){
		return i;
		}

		return occurance(arr,key,i+1);
	
	}

}
