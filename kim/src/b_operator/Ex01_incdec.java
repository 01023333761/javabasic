package b_operator;

public class Ex01_incdec {

	public static void main(String[] args) {
		// 정수변수 a에다가 5를선언
		int a = 5;
		int b = 7;

		System.out.println("A=" + a + ",B=" + b);
		// 문자 플러스 숫자 문자로 계산됨
		System.out.println("A=" + (a + 1) + ",B=" + (b - 1));
		// 괄호안에 것을 먼저 계산

		a = a + 1;
		b = b - 1;
		// 증가감소연산자
		a++; // a = a + 1;
		b--; // b = b - 1;
		System.out.println("A=" + a + ",B=" + b);

		++a; // a = a + 1;
		--b; // b = b - 1;
		System.out.println("A=" + a + ",B=" + b);
		// -------
		int z = 10, y = 10;
		int result = ++z; // z=z+1; int result = z;
		System.out.println(result); // 11

		int result2 = y++;// ; int result2= y;, y=y+1;
		System.out.println(result2); // 10

		System.out.println("z=" + z + ",y=" + y); // z=11, y=11

		System.out.println("z=" + ++z + ",y=" + --y); // z =12 y=10
		System.out.println("z=" + z++ + ",y=" + y--); // z =12 y=10

		System.out.println("z=" + z + ",y=" + y); // z=13 y=9

	}
}