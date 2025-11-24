class SubStringDemo{
	public static void main(String[] args){
		String str="Prajakta";	
		System.out.println(SubString(str,5,6));
	}

	public static String SubString(String str,int si,int ei){
		String subStr="";
		for(int i=si;i<=ei;i++){
		subStr+=str.charAt(i);
		
		}
		return subStr;
		
	
	}

}
