package kh.predicate;

import java.util.function.Predicate;

public class PredicateMain {

	public static void main(String[] args) {
		// Predicate<T> => boolean test(T t): 추상 메소드
		Predicate<String> pre = t -> {
				boolean flag = false;
				try {
					Integer.parseInt(t);
					flag = true;
				} catch(NumberFormatException e) {
					flag = false;
				} catch(Exception e) {
					flag = false;
				}
				return false;
			
		};
		boolean flag = pre.test("사랑2345");
		System.out.printf("%s \n",(flag == true)?("숫자로 변환됩니다"):("숫자로 번환되지 않음"));
		System.out.println("The end");

	}

}
