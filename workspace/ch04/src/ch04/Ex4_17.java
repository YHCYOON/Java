package ch04;

public class Ex4_17 {

	public static void main(String[] args) {
		
		// continue ���� �̿��� 1���� 10���� ������ 3�� ����� �����ϰ� ���
		for(int i = 1 ; i <= 10 ; i++) {
			if (i%3 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
