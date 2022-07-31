package testpackage;

public class vowelIfCheck {
	public static void main(String[] args) {
		
		String str ="Clean World Green World";
		int count =0 ;
	for (int cnt=0;cnt<str.length();cnt++) {
		
		char ch = str.charAt(cnt);
		
		if(ch == 'a' || ch == 'e' || ch=='i'|| ch =='o' || ch =='u') {
			count++;
		}
	}
	System.out.println("The vowel count is :" +count);
	}
	

}
