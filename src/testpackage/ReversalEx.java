package testpackage;

public class ReversalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Clean World Green World";
		
		String res = " ";
		
		for(int cnt = str.length()-1;cnt>=0;cnt--) {
			
			char ch = str.charAt(cnt);
			res =  ch + res;
		}

		System.out.println("The reverse of the string is : " +res);
	
	// reverse a number
		int num = 456789;
		int result= 0;
		
		while(num>0) {
			int rem = num %10;
			result = result*10 +rem;
			num = num/10;
		}
	
		System.out.println("The reverse of the number is :" +result);
		
		
		// occurence of the words in a string ?
	
	
	
	
	}
	

}
