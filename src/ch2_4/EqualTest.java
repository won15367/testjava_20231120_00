package ch2_4;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100;
		
		// num1이 100과 같은지 if 문으로 작성
		if (num1 == num2) {
			System.out.println("num1은 num2입니다.");			
		}
		
		String str1 = "Korea";
		String str2 = "Korea";
		if (str1 == str2) {
			// 문자열의 주소를 비교한다.
			System.out.println("str1은 str2입니다.");
		}
		
		if (str1.equals(str2)) { 
			// 문자열의 내용만 비교한다.
			System.out.println("str1은 str2입니다.");
		}
		
		String str3 = new String("Korea");
		if (str1 == str3) {
			// 문자열의 주소를 비교한다.
			System.out.println("==비교: str1은 str3입니다.");
		}
		
		if (str1.equals(str3)) { 
			// 문자열의 내용만 비교한다.
			System.out.println("equals비교: str1은 str3입니다.");
		}

	}
}
