package kh.consumer;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		// 함수형 인터페이스(추상 메서드 1개) -> 구현 클래스(오버라이딩) -> 부모 = 자식 구현 객체 -> 부모.추상메소드
		// Supplier<T>(T get() : 추상 메소드) -> 구현 클래스(X) -> 부모 = 자식 구현 객체(임시객체) -> 부모.추상메소드(람다식 표현)
		Supplier<String> sup = () -> {
				Scanner sc = new Scanner(System.in);
				System.out.printf("이름 입력:");
				String name = sc.nextLine();
				return String.format("%s 님 질문을 하신 당신은 멋쟁이", name);
		};
		
		String value = sup.get();
		System.out.println(value);
		
		System.out.println("The end");
	}

}
