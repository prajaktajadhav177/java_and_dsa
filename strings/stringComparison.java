class CompareString{

	public static void main(String[] args){
		String str1="Praju";
		String str2="Praju";
		String str3=new String("Praju");
	
		if(str1==str2){
		
		System.out.println("Str1 and str2 are equal");
		}
		else{

                System.out.println("Str1 and str2 are not equal");
                }

		 if(str1==str3){

                System.out.println("Str1 and str3 are equal");
                } else{
		
		System.out.println("Str1 and str3 are not equal");
		}


		  if(str1.equals(str3)){

                System.out.println("Str1 and str3 are equal");
                } else{

                System.out.println("Str1 and str3 are not equal");
                }

	}

}
