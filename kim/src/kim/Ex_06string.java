package kim;

/*
 * [주의] String 이름으로 클래스명 지정하면 안된다
 *
 * [대이타타임 - 자료형 ]

* 1. 기본형
* 2. 참조형 : 배열, 클래스
*    - 반드시 new 예약어를 메모리 확보를 해야 한다 
*    
*  *String 은 제공하는 클래스
*
*
*
*/
public class Ex_06string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;

		// [1] 클래스변수선언
		// [2] 메모리 확보
		String name;
		name = new String("홍길동");

		String name2 = new String("홍길동");

		/*
		 * name 변수의 값과 name2 변수의 값이 같다면 "이름이 같다" 출력 그렇지 않다면 "이름이 다르다"출력
		 */
		// 문자열값을 비교한다면??
		if (name.equals(name2)) {
			System.out.println("이름이 같다");
		} else {
			System.out.println("이름이 다르다");
		}

	}

}
