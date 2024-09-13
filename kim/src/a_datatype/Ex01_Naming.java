package a_datatype;

//주석 : 컴파일하지 않는 문장
// -한줄 주석
/*
 *  9 :  숫자9
 *  '9': 문자 9
 *  "9": 문자열9
 */

public class Ex01_Naming {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		// 문자형 변수 ch 선언하기
//		char ch;
//		char ch1;
//		char ch$;
//		char CH;
		// -----------------
		// [1] 변수를 선언
		char testch; // 문자변수 testch 선언
		// * 정수형변수 jungsun 선언

		// -----------------
		// [2] 갑을 지정(대입)
		testch = '깡'; // testch 변수에 '깡' 문자 지정(대입,저장)
		// * jungsu 변수를 출력

		// -----------------
		// [3] 출력
		System.out.println(testch);
	}

}
/*
 * [ 변수 ] 메모리상에 값을 저장하기 위한 공간 // 정수형 변수 abcdef 선언하기 int abcdef;
 * 
 * // 실수형 변수 f 선언하기 double f; // 논리형 변수 flag 선언하기 boolean flag;
 * 
 * 
 * 자료형(datatype) 변수명
 * 
 * 자료형 1 기본형 논리형 : boolean 문자형 : char 정수형 : int 실수형 : double
 * 
 * 2 참조형 : 배열 / 클래스
 * 
 * 변수명 규칙 1- 문자, 숫자, _, $ 조합 (가급적 $ 사용하지맙시다) 2- 숫자가 첫글자이면 안됨 3- 길이제한없음 4-
 * 대소문자구별함 5- 키워드 사용안됨 [권장사항]
 */
//       1- 클래스명은 대문자시작
//       2- 변수명은 소문자시작
//       3- 패키지명은 전부 소문자
//       4- 낙타표기법 ( camel-case)
//          [예]
//       -원을 그리는 클래스 : Drwacircle
//       -원을 그리는 변수 : drewcircle