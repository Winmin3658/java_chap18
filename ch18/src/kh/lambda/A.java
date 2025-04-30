package kh.lambda;

public interface A {
	// 입력 없음, 출력 없음
	public abstract void method();
}

interface D {
	// 입력 있고, 리턴 있음
	public abstract double methodD(int a, double b);
}

interface B {
	// 입력 없고, 리턴 있음
	int methodB(String a);
}
