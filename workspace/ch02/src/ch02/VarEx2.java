package ch02;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 4, y = 2;	// x와 y의 값 바꾸기
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
