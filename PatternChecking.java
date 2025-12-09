import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(UserMainCode.matchPattern(input));
	}
}

class UserMainCode{
	public static boolean matchPattern(String input){
		return input.matches("CPT-\\d{6}");
	}
}