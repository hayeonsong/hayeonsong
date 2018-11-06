package text;

public class test_2 {
	
	public static void main(String[] args) {

		System.out.println("오늘의 날씨는 10도 입니다");
		System.out.printf("오늘의 날씨는 %d도 입니다\n" , 10);
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\' 입니다. \n ", 'a' , 'A');

		double d = 0.123456d;
		System.out.printf("d = %f \n" , d);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 "+ num1 +"도 입니다. " );
		System.out.printf("오늘의 기온은 %d도 입니다. \n" , num1 );
		System.out.printf("홍길동은 %d 학년 %d반 %d번 입니다. \n ", 2 , 3, 4);
		
		int num2 = 30;
		System.out.printf("num2(10진수) : %d \n" , num2);
		System.out.printf("num2(8진수) : %o\n ", num2);
		System.out.printf("num2(16진수) : %n\n" , num2);

		System.out.printf("\'%s\' 를 대문자로 바꾸면 \'%s'\' 입니다 \n ", "java" , "JAVA");
		
	 System.out.printf("%d \n" , 123);
	 System.out.printf("%5d \n" , 1234);
	 System.out.printf("%5d \n" , 12345);

	 System.out.printf("%f \n" , 1.23);
	 System.out.printf("%.0f \n" , 1.23);
	 System.out.printf("%.1f \n" , 1.23);
	 System.out.printf("%.2f \n" , 1.23);	
	
	}

}
