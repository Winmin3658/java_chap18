package kh.consumer;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ConsumerMain {

	public static void main(String[] args) {
		// 인터페이스 -> 구현 클래스 -> 구현 객체 -> 부자 관계 -> 부.추상메소드
		// Consumer X -> x -> 구현 객체(부자관계) -> 부.추상메소드

		Consumer<String> con = t -> System.out.printf("%s 님 환영합니다 \n", t);
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");
		System.out.println("==============");

//		Scanner scan = new Scanner(System.in);
//		System.out.print("입력할 단을 입력하시오: ");
//		int gugudan = Integer.parseInt(scan.nextLine());
//		Consumer<String> con1 = t -> System.out.printf("%s 구구단 출력", t);
//		for(int i = 0; i < ; i++) {
//			
//		}
//		System.out.println("==============");

		IntStream.rangeClosed(2, 9).forEach(dan -> {
			System.out.println("[" + dan + "단]");
			IntStream.rangeClosed(1, 9).mapToObj(i -> dan + " x " + i + " = " + (dan * i)).forEach(System.out::println);
			System.out.println();
		});

		System.out.println("The end");
	}

}
