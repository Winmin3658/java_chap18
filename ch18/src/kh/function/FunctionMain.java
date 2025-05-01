package kh.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		// Function<T,R> => R apply(T t) 추상 메소드
		String name = "홍길동";
		
		Function<String, Integer> func = t -> t.length();
		int length = func.apply(name);
		
		System.out.printf("%s 님의 리턴 문자열의 길이는 %d입니다", name, length);
	}

}
