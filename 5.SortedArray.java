import java.util.*;
import java.io.*;


class Main{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String strarr[]=new String[n];
		
		for(int i=0;i<n;i++){
			strarr[i]=br.readLine();
		}
		
		String output[]=UserMainCode.removeDuplicates(strarr);
		for(String s:output){
			System.out.println(s);
		}
		br.close();
	}
}



class UserMainCode{
	public static String[] removeDuplicates(String [] input){
		
		Set<String> result=new TreeSet<String>();
		for(String s:input){
			result.add(s);
		}
		
		String result1[]=new String[result.size()];
		
		int i=0;
		
		for(String s:result){
			result1[i++]=s;
		}
		
		return result1;
		
		
		
	}
}