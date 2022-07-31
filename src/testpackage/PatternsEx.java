package testpackage;

public class PatternsEx {
	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++)
		{
			int j =1;
			while(j<=i) {
				System.out.print("*"); // print in the same line
				j++;
			}
		System.out.println(); // print in the nextline (ln)
		}
	}	

}
