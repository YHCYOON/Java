package ch04;

public class Ex4_13 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		while(sum<=100) {
			System.out.println("0 ���� " + num + " ������ �� = " + sum);
			sum += ++num;
		}
	}

}
