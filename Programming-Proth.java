import java.util.Scanner;
import java.lang.*;
import java.math.BigDecimal;
class Proth{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to check if it is a Proth Prime!");
		int num = input.nextInt();

		if (firstCheck(num)==true){
			System.out.println("This is not Proth Prime");
		}else
			System.out.println(prothCheck(num));
	}

	public static boolean firstCheck(int x){
		boolean bool=true;
		if (x % 2 == 0){
			bool = true;
		}else
			bool = false;

		return bool; 
	}
	public static boolean power(int n) {
		 return n != 0 && ((n & (n - 1)) == 0);
	}
	
	public static String prothCheck(int a){
		int n = a-1;
		String proth= a+ ": It is not a Proth Prime";
		int k = 1;
		while(k <(n/k)) {
			if (n %k ==0) {
				if(power(n/k)) {
					proth = a+": It is a Proth Prime";
				}
				k = k+2;
			}
		}
		return proth;
	}
}
