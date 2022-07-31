package testpackage;

public class LoopingEx {

	public static void main(String[] args) {
		// While Loop
		int num =2;  // to print all even number in range 1 - 10 and num=1 for odd
		
		while(num<=10) {
			if(num ==6) {
				num = num+2;
				continue;  //or Break;
			}
			System.out.println(num);
//			num++;
			num=num+2;
		}
		System.out.println("After while loop");
		
		
		for (int index =1 ;index<=10;index++) {
			
			if(index == 6) {
				continue;
			}
			System.out.println(index);
		}
		System.out.println("After for loop");
		
		int[] array1 = {10,20,30,40,50,60};
		
		for (int number : array1) {
			System.out.println(number);
		}
	
		System.out.println("After foreach loop");
		
		// Exercise where print all the elements inside array using simple for loop
		
		for(int cnt =0 ;cnt<array1.length;cnt++) {
			
			System.out.println(array1[cnt]);
		}
	
	}

}
