package ch05;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] ball = new int[45];	// 45���� �������� ������ ������ ����
		
		// �迭�� �� ��ҿ� 1~45�� ����
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int tmp = 0;	// �� ���� �ٲٴµ� ����� �ӽú���
		int j = 0;		// ������ ���� �� ������ ����
		
		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���´�
		// 0��° ���� 5��° ��ұ��� 6���� �ٲ۴�
		for(int i = 0; i < 6; i++) {
			tmp = ball[i];
			j = (int) (Math.random()*45);
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		System.out.println(Arrays.toString(ball));
		for(int i = 0; i < 6; i++) {
			System.out.println(ball[i]);
		}
	}
	

}
