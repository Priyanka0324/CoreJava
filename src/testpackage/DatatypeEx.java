package testpackage;

public class DatatypeEx {

	public static void main(String[] args) {

		int num1 =20;
		int num2 = 30;
		
		int sum = num1 + num2;
		float div = (float) num1/num2;
		
		System.out.println("The sum of 2 numbers are " + (num1  + num2) );//or +sum
		System.out.println("The division of 2 number is " +div);
		
		String str1 = "Clean World Green World";
		System.out.println(str1);
		System.out.println("The length of the string is " +str1.length());
		
		char ch1 = str1.charAt(0);
		System.out.println("The first character is " +ch1);
		
		char chl= str1.charAt(str1.length() -1);
		System.out.println("The last character of the string is " +chl);
		
		System.out.println("The string in uppercase is " +str1.toUpperCase());
		System.out.println("The string in lowercase is " +str1.toLowerCase());
	}

}
