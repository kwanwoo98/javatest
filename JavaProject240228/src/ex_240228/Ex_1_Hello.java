package ex_240228;

public class Ex_1_Hello {

	// public: 모든 위치에서 접근가능
	// static: (전역처럼 사용가능)클래스 메소드(함수), 매개변수 2개, 리턴값있음 
	// int: 리턴타입, sum 메소드를 수행 후 결과값을 반환 타입
	// sum: 메소드명, (int a,int b), 매개변수, 변수명은 임의로 작성가능
	// 이 매소드는 해당 클래스가 , 로더: 클래스를 불러오는 역할
	// 실행시, 해당 static 붙은 메소드, 변수등은, 시스템에 불러와져 있어서 클래스명으로 사용가능
	// return 결과값
	// 메소드가 정의된 부분.
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	// void: 리턴값 없음
	// main: 메소드 명, main은 보통 프로그램의 시작.
	// (String[] args): 매개변수의 정의부분, 타입이 배열로 정의가 되어 있음.
	// String[]: 문자열 배열 
	// char: 한문자 
	
	public static void main(String[] args) {
		// 뼈대코드. 
		// TODO Auto-generated method stub
		
		int i = 20;
		int i2;
		i2 = 3;
		char a = 'a';
		String str = "ddd";
		
		int resultNum = sum(100,200);
		
		System.out.println("출력연습: 단축키: syso+cntl+space");
		System.out.println("i 값 : " + i);
		System.out.println("실행 단축키 : ctrl + f11");
		System.out.println("==================================");
		System.out.println("===>복붙");
		System.out.println("저장 수동 ctrl + f11");
		System.out.println("i2값: " + i2);
		System.out.println("a 값: " + a);
		System.out.println("str값" + str);
		System.out.println("");
	}

}
