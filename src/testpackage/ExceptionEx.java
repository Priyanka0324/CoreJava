package testpackage;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {3,4,5};
		int num =10;
		
		try {
//			int res = num/0;
			System.out.println(array[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("inside catch block");
		
		}
		catch(ArithmeticException e) {
			System.out.println("After Arithemetic exception");
		}
		finally {   // it will be always executed irrespective of exceptions 
			System.out.println("After finally ");
		}
		System.out.println("After exception");
		
	}

}
