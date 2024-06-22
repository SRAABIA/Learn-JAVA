package firstpkg;

import java.util.Scanner;

public class CountingOccurences {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number you want to reverse: ");
		int n = in.nextInt();
		
		int rem = 0;
		int rev = 0;
		while(n>0) {
			rem = n%10;
			rev *= 10;
			rev += rem;
			
			n = n/10;	
		}
		System.out.println("Count is: "+rev);
		
	}

}
