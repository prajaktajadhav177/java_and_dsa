class SelectionSort{
	public static void main(String[] args){
	
		int arr[]={5,4,3,2,1};
		sorting(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void sorting(int arr[]){
		
		
		for(int i=0;i<arr.length;i++){
			 int minNum=i;
			for(int j=i+1;j<arr.length;j++){	
				if(arr[i]>arr[j]){
				minNum=j;
			}
		
			}
			 
			 int temp = arr[i];
        		 arr[i] = arr[minNum];
            		 arr[minNum] = temp;
			
		}

	}
}
