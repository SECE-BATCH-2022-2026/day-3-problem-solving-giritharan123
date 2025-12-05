import java.util.*;
import java.io.*;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int count=UserMainCode.countOccurance(s1,s2);
		System.out.print(s1);
	}
}

class UserMainCode{

public static int countOccurance(String s1,String s2){
	int count=0;
	
	if(s1.length()==0&&s2.length()==0){
		return 0;
	}

	
	for(int i=0;i<=s1.length()-s2.length();i++){
		
		String text=s1.substring(i,i+s2.length());
		
		if(text.equals(s2)){
			count++;
		}
		
	}
	return count;
	

}	

	
}