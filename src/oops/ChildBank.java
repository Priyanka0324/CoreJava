package oops;

public class ChildBank extends Bank{
	
	public int CreditCardNum;
	
	public void CCBalance() {
		System.out.println("Inside CCBalance");
		
		this.CreditCardNum = 1000; // this = current class
		super.AccNum = 123456; // super = parent
		this.CCBalance();
		super.DisplayAccBalance();
	}

	public void closeAcc(int ccNum) {
		System.out.println("Inside childBank CCAcc");
	}
}
