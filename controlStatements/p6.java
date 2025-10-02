class Demo {
	public static void main(String[] args){
		int x=50;
		System.out.println("Start code");
		switch(x){
			case 20+30 :  					//p6.java:12: error: duplicate case label
                      
				System.out.println("20+30");
		break;
			case 25==25:
				System.out.println("25+25");
		break;
		
			case 10>=40:
					//p6.java:12: error: incompatible types: boolean cannot be converted to int
                       
				System.out.println("10+40");

		break;
			case 50:   
				System.out.println("10+40");	
			
		break;	
			default:
				System.out.println("DEfault State");	
		}
	}
}	
