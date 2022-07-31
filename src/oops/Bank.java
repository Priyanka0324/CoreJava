package oops;

public class Bank {
	public int AccNum;
	
	public void DisplayAccBalance() {
		System.out.println(" inside Display Acc Balance");
	}
	public int GetBalance() {
		return 100;
	}
	public void closeAcc(int AccNum) {
		System.out.println("Inside Bank CloseAcc");
	}

}
