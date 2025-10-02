class ReverseArray{

	public static void main(String[] args){
	
	int nums[]={3,4,56,7,8};
	reverse(nums);
	for(int i=0;i<nums.length;i++){
	
	System.out.print(nums[i]+" ");
	}
	}
	public static void reverse(int nums[]){
	
	int start=0;
	int end=nums.length-1;
	while(start<end){
	int temp=nums[start];
	nums[start]=nums[end];
	nums[end]=temp;
	start++;
	end--;
	}
	}

}
