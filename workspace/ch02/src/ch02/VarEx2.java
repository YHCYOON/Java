package ch02;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 4, y = 2;	// x�� y�� �� �ٲٱ�
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
