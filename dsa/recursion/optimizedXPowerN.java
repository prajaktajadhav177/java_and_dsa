class Power{
	public static void main(String[] args){
	
	int a=2;
	int n=10;
	System.out.println(calculatePower(a,n));
	}

	public static int calculatePower(int a, int n){
	
	if(n==0){
	
		return 1;
	}	
	
	int halfPower=calculatePower(a,n/2);

	int power=halfPower*halfPower;
	
	if(n%2!=0){
        halfPower=a*halfPower;


	}
	return power;
	
}	
}
