package kh.lambda;

import java.util.Scanner;

// 2. 구현 클래스 설계한다
public class TestChild implements Test{

	@Override
	// 3. 오버라이딩을 통해서 자기가 생각한 부분을 설계한다
	public int methodTest(String a) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s 점수 요청: ",a);
		int value = Integer.parseInt(scan.nextLine());
		
		return value;
	}

}
