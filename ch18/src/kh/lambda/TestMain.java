package kh.lambda;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		//4. 구현 객체를 생성한다
		TestChild tc = new TestChild();
		
		// 5. 부자 관계
		Test test = tc;
		
		// 6. 다형성 구현
		int kor = test.methodTest("국어");
		System.out.printf("국어 점수 = %d \n", kor);
		System.out.println("---------------");
		
		Test test2 = a -> {
				Scanner scan = new Scanner(System.in);
				System.out.printf("%s 점수 요청: ",a);
				int value = Integer.parseInt(scan.nextLine());
				
				return value;
		};
		int eng = test2.methodTest("영어");
		System.out.printf("영어 점수 = %d \n", eng);
		
		System.out.println("The end");
	}

}
