class ShortestPath{
	public static void main(String[] args){
	String str="NSS";
		
		System.out.println(findPath(str));
	}

	public static float findPath(String str){
		int x=0;
		int y=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='N'){
			y+=1;
			}
			else if(str.charAt(i)=='S'){
				y-=1;
			}
			else if(str.charAt(i)=='E'){
                                x+=1;
                        }
			else if(str.charAt(i)=='S'){
                                x-=1;
                        }
		
		}

		float path=(float)Math.sqrt((x*x)+(y*y));
		return path;
	}

}
