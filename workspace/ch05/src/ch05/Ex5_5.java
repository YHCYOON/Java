package ch05;

import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] ball = new int[45];	// 45개의 정수값을 저장할 공간을 만듦
		
		// 배열의 각 요소에 1~45를 저장
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int tmp = 0;	// 두 값을 바꾸는데 사용할 임시변수
		int j = 0;		// 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 섞는다
		// 0번째 부터 5번째 요소까지 6개만 바꾼다
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
