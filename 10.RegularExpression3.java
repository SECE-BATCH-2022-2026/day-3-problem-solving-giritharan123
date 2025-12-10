import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(UserMainCode.phoneValidator(input));
		
	}
}


class UserMainCode{
	public static boolean phoneValidator(String inp){
		return inp.matches("[1-9]{2}[0-9]{8}");
	}
}