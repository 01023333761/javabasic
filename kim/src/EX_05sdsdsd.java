
public class EX_05sdsdsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor; //숫자를 지정하는 변수 kor를 선언 kor= 30; //선언에 변수애 30대입
		 * 
		 * // 초기화 = 변수선언+값대입 int eng = 30;
		 */
		int kor = 30, eng = 40;

		System.out.println("국어:" + kor + " ,영어= " + eng);
		System.out.printf("국어: %d , 영어= %d\n\n\n", kor, eng);

		/*
		 * 만약에 국어점수와 영어점수가 동일하니 그렇다면 "두 점수가 동일"이라고 출력 그렇지않다면 "두 점수는 다름"이라고 출력
		 */

		if (kor == eng) {
			System.out.println("두 점수가 동일");
		} else {
			System.out.println("두 점수가 다름");
		}
		// 두 점수 맞바꾸기 - 두 변수의 값을 바꾸기
		// kor=30, eng=50
		// [바꾼 후] kor=50, eng=30
		int temp = kor;
		kor = eng;
		eng = temp;
		System.out.printf("국어: %d , 영어= %d\n\n\n", kor, eng);

	}
}
