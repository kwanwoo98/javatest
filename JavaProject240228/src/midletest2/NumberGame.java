package midletest2;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");

		int random_num = (int) (Math.random() * 100 + 1);

		System.out.println("컴퓨터가 숫자를 생각했습니다.");

		if (random_num % 2 == 1) {
			System.out.println("힌트는 홀수입니다.");
		} else {
			System.out.println("힌트는 짝수입니다.");
		}

		int i = 0;

		while (true) {
			i++;
			System.out.println("1~100 사이의 값을 입력 >>");
			int guess_num = scanner.nextInt();

			if (guess_num < random_num) {
				System.out.println("더 큰 수입니다");
			}

			else if (guess_num > random_num) {
				System.out.println("더 작은 수입니다.");
			}

			else {
				System.out.println(i + "회 만에 맞췄습니다.");
				System.out.println("=== 게임을 종료합니다. ===");
				break;
			}
		}
	}
}
