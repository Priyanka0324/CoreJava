package testpackage;

public class ConditionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;

		if(age>=18) {

			System.out.println("You are eligible to Vote ,please go ahead");

		}
		else if(age == 17){

			System.out.println("Not eligible ,please try next year");	
		}
		else {

			System.out.println("Not eligible");
		}
	}

}
