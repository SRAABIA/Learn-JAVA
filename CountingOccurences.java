package firstpkg;

import java.util.Scanner;

public class CountingOccurences {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = in.nextInt();
		System.out.println("Enter number you want to count: ");
		int x = in.nextInt();
		int rem = 0;
		int count = 0;
		while(n>0) {
			rem = n%10;
			if(rem==x) {
				count++;
			}
			n = n/10;	
		}
		System.out.println("Count is: "+count);
		
	}

}
