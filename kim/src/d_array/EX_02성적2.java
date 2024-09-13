package d_array;

import java.util.*;

/*
 * 5명의 국어점수를 입력하세요 
 * 총점은 xxxx이고, 평균은 0000입니다.
 */
public class EX_02성적2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하세요 ");
		String score_str = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(score_str,"/");
		
		int score [] = new int[st.countTokens()];

	}

}
