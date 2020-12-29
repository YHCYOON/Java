package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 롤");
			System.out.println("2. 배그");
			System.out.println("3. 메이플");
			System.out.println("원하는 게임을 선택하세요. (종료 : 0)");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if( menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if (!(1 <= menu && menu <= 3)) {
				System.out.println("게임을 잘못 선택했습니다. 다시 입력해주세요. (종료 : 0)");
				continue;
			}
			
			System.out.println("선택하신 게임은 " + menu + "번 입니다");
		}
	}

}
