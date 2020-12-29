package ch04;

public class Ex4_19 {

	public static void main(String[] args) {

		// for 문에 Loop1 이라는 이름을 붙임.
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					break;
//					break Loop1;
				}
				System.out.println(i + "*" + j + "=" + i * j);

			}
			System.out.println();
		}
	}
}
