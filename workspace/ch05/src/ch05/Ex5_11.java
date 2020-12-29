package ch05;

public class Ex5_11 {

	public static void main(String[] args) {
		//				  01234
		String str = "ABCDE";
		
		char ch = str.charAt(4);
		System.out.println(ch);
		
		String str2 = str.substring(1, 4);
		System.out.println(str2);		
		
		String str3 = str.substring(1);
//		String str3 = str.substring(1, str.length());
		
		System.out.println(str3);
	}

}
