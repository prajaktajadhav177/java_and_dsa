class PrintNNaturalNo{

	public static void main(String[] args){
	
	int n=10;
	System.out.println(FindSum(n));
	}

	public static int FindSum(int n){
		if(n==1){
		return 1;
		}
		int count=FindSum(n-1);
		int sum=n+count;

		return sum;
	}

}
