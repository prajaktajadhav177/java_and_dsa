class ReverseArray{

public static void main(String[] args){

	int nums[]={3,53,7,8,9};
	reverse(nums);
	for(int i=0;i<nums.length;i++){
	System.out.print(nums[i]+"");
	
	}
	System.out.println();
}

public static void reverse(int nums[]){

int j=nums.length-1;
for(int i=0;i<nums.length/2;i++){
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;
j--;

}

}

}
