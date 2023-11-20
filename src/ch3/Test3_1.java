package ch3;

public class Test3_1 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if (a > 10 && b > 20) {
			// &&: and, ||: or, 
		}
		
		// 중감연산자 ++, --
		
		int c = ++a;
		System.out.println(c);
		System.out.println(a);
		
		System.out.println("a: " + --a);
		System.out.println("a: " + --a);
		System.out.println("a: " + ++a);
	}

}
