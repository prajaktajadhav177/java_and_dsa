class PowerOfX{
	public static void main(String[] args){
		int x=2;
		int n=10;

		System.out.println(xPower(x,n));
	}

	public static int xPower(int x,int n){
		
		if(n==1){
			return x;
		};
	int xpn=xPower(x,n-1);
	int power=x*xpn;
	return power;
	
	}

}
