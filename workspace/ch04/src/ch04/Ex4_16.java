package ch04;

public class Ex4_16 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(true) {
			if( sum> 100) {
				break;
			}
			++i;
			sum += i;
		}
		System.out.println(i + " 까지의 합은 " + sum);
	}

}
