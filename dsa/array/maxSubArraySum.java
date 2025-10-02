class MaxSumOfSubArray{
	public static void main(String[] args){
		int nums[]={1,2,3,4,5,6};
		maxSum(nums);
	}
	public static void maxSum(int nums[]){
		int maxSum=Integer.MIN_VALUE;;
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
					int sum=0;
					for(int k=i;k<=j;k++){
					sum=sum+nums[k];
					  
		                }
				          if(sum>maxSum){
                                maxSum=sum;
                                }
		
	                }
			
		}
		 System.out.println("Maximun sum of subarray is:"+ maxSum);
	}

}
