package ch05;

import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		String[] strArr = {"����", "����", "��"};
		System.out.println(Arrays.toString(strArr));
		
		System.out.println((int)(Math.random()*3));
	
		for(int i = 0; i < 10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}
	}

}
