package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		// for문을 이용해 각 자리수의 합 구하기
//		int sum = 0;
//		
//		System.out.println("숫자를 입력하세요. ex)12345");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		
//		for(int num = Integer.parseInt(tmp) ; num > 0 ; num /= 10 ) {
//			System.out.println(num%10);
//			sum += num%10;
//		}
//		System.out.println("각 자리수의 합 : "+ sum);
		
		// while문을 이용해 각 자리수의 합 구하기
		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요. ex)12345");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum = sum + num%10;
			System.out.println(num%10);
			num /= 10;
		}
		System.out.println("각 자리수의 합 : " + sum);
	}

}
