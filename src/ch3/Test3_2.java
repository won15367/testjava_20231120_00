package ch3;

public class Test3_2 {
		
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		int result1 = ++a + 10;
		int result2 = b++ + 10;
		
		System.out.println("result1: " + result1);
		System.out.println("a: " + a);
		System.out.println("result2: " + result2);
		System.out.println("b: " + b);
		
		int x = 10;
		int y = x++;
		
		System.out.println("y: " + y);
		System.out.println("x: " + x);
	}
}
