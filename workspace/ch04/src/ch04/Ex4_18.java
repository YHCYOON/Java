package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. ��");
			System.out.println("2. ���");
			System.out.println("3. ������");
			System.out.println("���ϴ� ������ �����ϼ���. (���� : 0)");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if( menu == 0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if (!(1 <= menu && menu <= 3)) {
				System.out.println("������ �߸� �����߽��ϴ�. �ٽ� �Է����ּ���. (���� : 0)");
				continue;
			}
			
			System.out.println("�����Ͻ� ������ " + menu + "�� �Դϴ�");
		}
	}

}
