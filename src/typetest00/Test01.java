package typetest00;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		double result;
		
		result = (double)a / b;
    	System.out.println(result);
    	
    	String str = "123";
    	int c;
    	double d;
    	c = Integer.parseInt(str);
    	d = Double.parseDouble(str);
    	
    	System.out.println(c);
    	System.out.println(d);
    	
    	int i1 = 1234;
    	String str1 = String.valueOf(i1);  // 정수 또는 실수를 문자열로 변환
    	System.out.println(str1);
	}

}
