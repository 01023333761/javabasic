package kim;
/*
 *  자바에서 콘솔 입력받는 방법
 *  
 *   -java.util.sccnner 클래스 이용
 *   
 *   -정수형입력시 : nextInt()
 *   -실수형입력시 : nextDoble()
 *   -문자열입력시 : next() / nextLine() [숙제] 차이점?
 *   
 *   
 */

import java.util.*;

///[참고] 자주사용하는 기본적인 클래스는 java.lang 패키지
/// import java.lang.*;

public class Ex08_sccaner {

	public static void main(String[] args) {

		int kor, eng, math;

		Scanner input = new Scanner(System.in); // 입력받기위한 통로개척
		System.out.println("국어입력-");
		kor = input.nextInt();
		
		eng = input.nextInt();
		math = input.nextInt();

		// 영어점수입력받기, 수학점수입력받기, 출력

		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		// 총점구해서 출력

		// 평균구해서 출력

	}

}
