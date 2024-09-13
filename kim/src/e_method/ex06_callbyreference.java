package e_method;

/*
 *  call by value
 *      : 메소드의 인자(파라메터)의 자료형이 참조형인 경우
 *      
 *      => 주소만복사
 */
public class ex06_callbyreference {

	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");

		add(a, b);
		System.out.println("2. A=" + a + ",B=" + b);
	}

	static void add(StringBuffer a, StringBuffer b) {

		a.append(b); // 문자열 합침 참조형이기 때문에
		System.out.println("1. A=" + a + ",B=" + b);

	}
}