package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) +1;		// 1~100������ ������ ��
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1���� 100������ ������ �Է��ϼ���.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("���亸�� Ů�ϴ�. �ٽ� �Է����ּ���.");
			}else if(input < answer) {
				System.out.println("���亸�� �۽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while(input!=answer);
		System.out.println("�����Դϴ�.");
	}

}
