package ch04;

public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		// ��ȣ���� ������ 20�� �ݺ�
//		for(int i = 1; i <= 20; i++) {
//			System.out.println(Math.random());
//		}
		
		// 1~10 ������ ������ 20�� ���
//		for(int i = 1; i <= 20; i++) {
//			System.out.println((int)(Math.random()*10+1));
//		}
		
		// -5~5 ������ ������ 20�� ���
		for(int i = 1; i <= 20; i++) {
			System.out.println((int)(Math.random()*11)-5);
		}
	}

}
