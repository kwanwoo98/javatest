package ex_240229;

import java.util.Scanner;

public class Ex_8_Array_test3 {

	public static void main(String[] args) {
		// 양수 5개를 입력받아서, 배열에 저장하고, 제일 큰수를 출력하기. 합계, 평균, 최솟값도 구하기. 
		// 함수를 만들어서, 매개변수에 배열 타입으로 받아서, 출력하기. 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(1~100중에서)연속된 양수만 5개 입력해주세요>>");
		// 배열선언 
		int intArray [] = new int[5];
		// 나중에 출력하기 위한 준비물
		int max = 0;
		int min = 0;
		int temp = 0;
		int sum = 0;
		int avg = 0;
		
		
		
		for (int i = 0 ; i < intArray.length; i++) {
			// 배열에 입력된 양수 5개 값 설정
			intArray[i] = scanner.nextInt();
			min = intArray[0];
		// 최대값
			
			if(intArray[i]>max) {
				max = intArray[i];
			} 
			//최솟값 , 구하기, gpt 활용. 
		    // 배열의 첫 번째 요소를 초기 최솟값으로 설정
	        
	        else if (intArray[i] < min) {
                min = intArray[i]; // 현재까지의 최솟값보다 작은 값이 나오면 최솟값을 업데이트
            }
	        
			//총합 
			sum += intArray[i];
			
			
		}
		// 배열에서 정렬 기능이 없어서 패스 함. 
		// 최소값, 배열을 정렬 후,(오름차순으로 정렬하고, 첫번째 요소가 가장 작은 요소가 됨.)
		
		System.out.println("최댓값 : " + max + ", 최솟값 : " + min);
		System.out.println("합계 : " + sum + ", 평균 : " + sum/intArray.length);
		
		
		
		
		
		
	}
	
	

}