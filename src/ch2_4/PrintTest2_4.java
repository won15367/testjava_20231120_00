package ch2_4;

public class PrintTest2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World!";
		System.out.print(str);
		System.out.print(str);  // 다음줄로 가지 않고 연결되서 나온다
		System.out.println(str);
		System.out.println(str);  // 다음줄로 자동으로 넘어감
		
		System.out.printf("나의 나이는 %d입니다.\n", 30);  // C언어의 프리트 기능을 가져온것
		// %d: 정수, %f: 실수, %s: 문자
		
		
		
	}

}
