package kh.lambda;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		// 임시 객체 부 = new 자식()
		// 입력 없다, 출력 없다 => 람다식
		A a1 = () -> System.out.println("입력 없고, 출력 없다"); // 자식 임시 객체 자식이 부모 오버라이딩

		// 부모 추상 메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이 됨
		a1.method();
		System.out.println("---------------");

		// 입력 있고, 리턴 있음
		D d = (a, b1) -> a + b1;
		double value = d.methodD(10, 20.5);
		System.out.printf("d.methodD(10, 20.5) = %.2f \n", value);
		System.out.println("---------------");

		// 입력 없고, 리턴 있음
		B b = (name) -> {
			Scanner scan = new Scanner(System.in);
			System.out.printf("당신의 %s 입력: ", name);
			int value2 = Integer.parseInt(scan.nextLine());
			return value2;
		};
		
		int value3  = b.methodB("국어");
		int value4  = b.methodB("영어");
		System.out.printf("당신의 점수는 %d입니다 \n", value3);
		System.out.printf("당신의 점수는 %d입니다 \n", value4);
		System.out.println("The end!");
	}

}
