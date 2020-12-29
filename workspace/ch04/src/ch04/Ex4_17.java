package ch04;

public class Ex4_17 {

	public static void main(String[] args) {
		
		// continue 문을 이용해 1부터 10까지 숫자중 3의 배수를 제외하고 출력
		for(int i = 1 ; i <= 10 ; i++) {
			if (i%3 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
