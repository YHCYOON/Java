package ch03;

public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		// 3.142 를 얻으려면
		
//		System.out.println(pi);
//		System.out.println(pi*1000);
//		System.out.println(Math.round(pi*1000));
//		System.out.println(Math.round(pi*1000) / 1000.0);
		
		// 3.141 을 얻으려면
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println(((int)(pi*1000)/1000.0));		
	}

}
