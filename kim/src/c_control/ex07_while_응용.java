package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *  for문: 반복횟수를 정해져 있는 경우 주로 사용
 *  while문 : 반복횟수를 모를 때 주로 사용
 * 
 */
public class ex07_while_응용 {

	public static void main(String[] args) {

		// 예 : 국어/영어/수학 - > 90/88/70

		Scanner input = new Scanner(System.in);
		System.out.println("예 : 국어/"
				+ "영어/수학(90/88/70)->");
		String str = input.nextLine();
		//System.out.println(str);
		

// 반복횟수 알 수 있다면
//		int cnt = st.countTokens();
//	for (int i = 0; i < st.countTokens(); i++) {
//	String token = st.nextToken();
//		System.out.println("점수:" + token);
//}

		StringTokenizer st = new StringTokenizer(str,"/"); // 구분자 기본값: 공백

		while(st.hasMoreTokens()) {
	 String token = st.nextToken();
	 System.out.println("점수:"  + token);
	}
	}
}



