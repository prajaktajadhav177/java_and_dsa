class SubArray{
	public static void main(String[] args){
		int nums[]={2,3,4,5,6,7,8,9};
		printSubarray(nums);
	}

	public static void printSubarray(int nums[]){
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				
				for(int k=i;k<=j;k++){
					System.out.print(nums[k]+" ");
					
					 
				}

				 System.out.println();
			
			}
			System.out.println();
		}
		
	}

}
