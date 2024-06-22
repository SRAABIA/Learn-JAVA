package firstpkg;

import java.util.Scanner;

public class Casecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char ch = in.next().trim().charAt(0);
//		System.out.println(ch);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("Alphabet.");
		}
		else {
			System.out.println("Not An Alphabet.");
		}
	}
	

}
