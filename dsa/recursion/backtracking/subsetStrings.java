class SubsetStrings{
	public static void main(String[] args){
	 	String str="abc";
		findSubString(str,"",0);
	}

	public static void findSubString(String str, String ans, int i){
		if(i==str.length()){
			if(ans.length() == 0 ){
			System.out.println("null");
			}else{
			System.out.println(ans);
			}
			return;
		}

		findSubString(str,ans+str.charAt(i),i+1);
		findSubString(str,ans,i+1);
	}

}
