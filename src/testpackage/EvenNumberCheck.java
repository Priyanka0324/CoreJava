package testpackage;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num =33;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age :");
		
		int num = scanner.nextInt();
		if (num%2 ==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	}

}
