package testpackage;

public class VowelSwitchEx {

	public static void main(String[] args) {

		String str ="Clean World Green World";
		int count =0 ;
		for (int cnt=0;cnt<str.length();cnt++) {
			char ch = str.charAt(cnt);

			switch(ch){

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("The total vowels are :" +count);
	}
}
