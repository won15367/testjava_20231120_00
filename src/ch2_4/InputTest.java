package ch2_4;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
//		try {
//			int keycode = System.in.read();
//			System.out.println(keycode);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  //java는 예외처리가 필수이다.
		
		Scanner scanner = new Scanner(System.in); // new: 객체를 만들어주는 연산다
		
//		int keycode1 = scanner.nextInt();
//		System.out.println(keycode1);
//		
//		double keycode2 = scanner.nextDouble();
//		System.out.println(keycode2);
//		
//		String keycode3 = scanner.nextLine();  // 문자열 입력, 엔터가 입력될 때 까지 모두
//		System.out.println(keycode3);
//		
//		String keycode4 = scanner.next();  // 공백을 입력하면 거기까지 입력된다.
//		System.out.println(keycode4);
		
		char keycode5 = scanner.next().charAt(0);
		System.out.println(keycode5);
		
		
		
	}
}
