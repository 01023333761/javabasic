package a_datatype;

public class Ex02_valuable {

	public static void main(String[] args) {
		// ----------------------
		// [1] 변수를 선언
		char testCh; // 문자변수 testCh 선언
		int jungsu; // * 정수형변수 jungsun 선언
		double silsu; // * 실수형변수 silsu 선언
		boolean ok; // * 논리형변수 ok 선언
		ok = true;
		// ----------------------
		// [2] 값을 지정(대입)
		testCh = '깡'; // testCh 변수에 '깡' 문자 지정(대입,저장)
		jungsu = 10000; // * jungsu 변수에 10000 숫자 지정
		silsu = 3.6; // 선언한 실수형변수에 3.6 저장

		// ----------------------
		// [3]출력
		System.out.println("문자변수:" + testCh);
		System.out.println("정수형변수:");
		System.out.println("논리형변수" + ok);
	}

}