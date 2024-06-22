package firstpkg;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		// series of sum of previous two numbers
		// find the nth fibonacci numbers
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int i = 2;
		while(i< n) {
			int temp = 0;
			temp = b;
			b = a+b;
			a = b;
			i++;
		}
		System.out.println(b);
	}

}
