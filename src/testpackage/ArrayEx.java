package testpackage;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10,20,30,40,50,60};
		System.out.println("the size of array is " +array1.length );
		System.out.println("The second num is " +array1[1]);
		System.out.println("The second num is " +array1[4]);
		System.out.println("The last array value is " +array1[array1.length-1]);
		
//		String[] array2 = {"abc" ,"pqr","xyz"};
		
		String str1 = "Clean World Green World ";
		
		String[] array3 = str1.split(" ");
		
		System.out.println("the second word is " +array3[0]);
		System.out.println("the last word is " +array3[array3.length -1]);

	}

}
