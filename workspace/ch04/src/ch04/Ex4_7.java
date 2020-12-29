package ch04;

public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		// 괄호안의 내용을 20번 반복
//		for(int i = 1; i <= 20; i++) {
//			System.out.println(Math.random());
//		}
		
		// 1~10 사이의 난수를 20개 출력
//		for(int i = 1; i <= 20; i++) {
//			System.out.println((int)(Math.random()*10+1));
//		}
		
		// -5~5 사이의 난수를 20개 출력
		for(int i = 1; i <= 20; i++) {
			System.out.println((int)(Math.random()*11)-5);
		}
	}

}
