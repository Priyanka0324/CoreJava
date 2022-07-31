package testpackage;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =13;
		boolean flag = true;
		
		for (int cnt =2;cnt<num;cnt++) {
			
			int rem = num%cnt;
//			System.out.println("Lets check if rem = 0");
			
			if(rem==0) {
				System.out.println("The number is not Prime number");
				flag = false;
				break;
			}
		}

		if(flag) {
			System.out.println("The number is Prime number");
		}
			
	}

}
