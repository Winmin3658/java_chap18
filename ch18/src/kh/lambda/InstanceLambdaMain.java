package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		// 람다식(함수형 인터페이스 -> 인스턴스 메소드 System.out.println()
		C c = a -> System.out.println(a);
		
		C c2 = System.out::println;
		
		c.methodC(10);
		c2.methodC(100);
		System.out.println("-------------");
		A a = () -> Bobject.bcd();
		A a2 = Bobject::bcd;
		
		a.method();
		a2.method();
		System.out.println("-------------");
		Atest atest = (b,k) -> b.bcd(k);
		Atest atest2 = Bobject2::bcd;
		
		atest.abc(new Bobject2(), 10);
		atest2.abc(new Bobject2(), 20);
		
		System.out.println("The end");
		
	}

}
