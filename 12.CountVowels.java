import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		System.out.println(UserMainCode.vowelCount(input));
		
		
	}
}



class UserMainCode{
	public static int vowelCount(String input){
		int count=0;
		for(Character ch:input.toCharArray()){
			switch(ch){
				case 'A':
				case 'a':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
				 count++;
				 break;
				default:
				continue;
				} 
				
			}
			return count;
		}
	
	
}