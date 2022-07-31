package oops;

public class OverloadingEx {
	
	public int GetArea(int l , int b) {
		return l*b;
	}
	
	public int GetArea(int l) {
		return l*l;
		
	}
	
	public float GetArea(float d , float e) {
		return  d*e;
	}

}
