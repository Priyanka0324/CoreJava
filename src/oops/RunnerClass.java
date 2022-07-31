package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee E1 = new Employee();
//		
//		E1.Name = "Priyanka";  // Non - parameterized const
//		E1.EmpId = 2403;
//		E1.Dept = "ADAS";
//		
//		E1.Display();
//		
//		Employee E2 = new Employee("Shanti",1968,"HomeManagement"); //Parameterized const.
//		E2.Display();
//		
		Bank B = new Bank ();
//		B.DisplayAccBalance();
		
		int Bal = B.GetBalance();
		
		System.out.println("The balance is :" +Bal);
		System.out.println("The balance is : " + B.GetBalance());
		
		ChildBank B1 = new ChildBank();
		
//		B1.DisplayAccBalance();
//		B1.CCBalance();
		
		// Overloading
//		OverloadingEx obj = new OverloadingEx();
//		
//		int RectArea= obj.GetArea(5, 6);
//		System.out.println(RectArea);
//		int SqrArea = obj.GetArea(3);
//		System.out.println(SqrArea);
//		float RectfArea = obj.GetArea(3.5f, 4.5f);
//		System.out.println(RectfArea);
		
		//overriding
//		B1.closeAcc(12345);
//		B.closeAcc(2345);
		
		BrowserAbstractionEx BA = new Chrome();
		BA.openBrowser();
		BA.CloseBrowser();
		BA.DisplayName();
		
		Chrome ch = new Chrome();
		ch.openBrowser();
		ch.show();
		
		CarInterface HC = new HondaCar();
		EncapsulationEx En = new EncapsulationEx();
		En.setBalance(1000);
		System.out.println(En.getBalance());
		En.setName("Priyanka");
		System.out.println(En.getName());
		En.setAddress("Bangalore");
		System.out.println(En.getAddress());

	}

}
