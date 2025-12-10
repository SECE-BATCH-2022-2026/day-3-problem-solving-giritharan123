import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char split=sc.nextLine().charAt(0);
		String [] output=UserMainCode.splitString(input,split);
		for(String s:output){
			System.out.println(s);
		}
		
		
	}
}



class UserMainCode{
	public static String [] splitString(String inp,char split){
		String input[]=inp.split(""+split);
		String output[]=new String[input.length];
		int i=0;
		for(String s:input){
			StringBuilder sb=new StringBuilder(s);
			sb=sb.reverse();
			String s1=sb.toString();
			s1.toLowerCase();
			output[i++]=s1;			
			//output[i++]=new StringBuilder(s).reverse().toString().toLowerCase();
		}
		return output;
	}
	
}