package ch04;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
			if(score>98) {
				opt = '+';
			}else if(score<94) {
				opt = '-';
			}	
		}else if(score>=80) {
			grade = 'B';
			if(score>88) {
				opt = '+';
			}else if(score<84) {
				opt = '-';
			}
		}else if(score>70) {
			grade = 'C';
			if(score>78) {
				opt = '+';
			}else if(score<74) {
				opt = '-';
			}
		}else if(score>60) {
			grade = 'D';
			if(score>68) {
				opt = '+';
			}else if(score<64) {
				opt = '-';
			}
		}else {
			grade = 'F';
		}
		System.out.println("����� ������" + grade + opt + "�Դϴ�");
		
	}

}
