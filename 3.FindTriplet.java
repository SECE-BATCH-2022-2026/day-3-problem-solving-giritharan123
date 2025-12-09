import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		System.out.println(UserMainCode.findTriplet(array));
	}
}

class UserMainCode {
	public static boolean findTriplet (int [] array){
		int l = array.length;
		for(int i=0;i<l-3;i++){
			if(array[i] == array[i+1] && array[i+1]==array[i+2]){
				return true;
			}
		}
		return false;
	}
}