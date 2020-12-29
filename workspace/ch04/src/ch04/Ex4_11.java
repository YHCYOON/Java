package ch04;

public class Ex4_11 {

	public static void main(String[] args) {
//		// 구구단
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(i+"단");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
