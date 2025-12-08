import java.util.*;


class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		int n=sc.nextInt();
		String res=UserMainCode.repeatFront(inp,n);
		System.out.print(res);
		
	}
}

class UserMainCode{
	public static String repeatFront(String input,Integer n){
		int length=input.length();
		if(length==0){
			return input;
		}
		
		else if(length<3){
			String result="";
			for(int i=1;i<=n;i++){
				result+=input;
			}
			 return result;
			 }
	    else{
	    	String result1="";
	    	String input1=input.substring(0,3); 
	    	
	    	for(int i=1;i<=n;i++){
				result1+=input1;
			}
			return result1;
	    }
	}
}		 
	    