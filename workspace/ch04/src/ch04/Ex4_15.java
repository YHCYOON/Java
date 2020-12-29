package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) +1;		// 1~100까지의 임의의 수
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1부터 100까지의 정수를 입력하세요.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("정답보다 큽니다. 다시 입력해주세요.");
			}else if(input < answer) {
				System.out.println("정답보다 작습니다. 다시 입력해주세요.");
			}
		} while(input!=answer);
		System.out.println("정답입니다.");
	}

}
