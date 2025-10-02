class SumOfSubArray{
        public static void main(String[] args){
                int nums[]={2,3,4,5,6,7,8,9};
                printSumSubarray(nums);
        }

        public static void printSumSubarray(int nums[]){
                for(int i=0;i<nums.length;i++){
                        for(int j=i;j<nums.length;j++){
					int sum=0;
                                for(int k=i;k<=j;k++){
                                        System.out.print(nums[k]+" ");
					sum=sum+nums[k];
                                }
				System.out.println();
				 System.out.println("Sum of subarray is:"+ sum);

                                 

                        }
                        System.out.println();
                }

	}
}	


