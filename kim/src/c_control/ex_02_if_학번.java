package c_control;

import java.util.Scanner;

public class ex_02_if_학번 {

	public static void main(String[] args) {

		String hakbun = "2017111001";

		// 입학연도 구하기
		String year = hakbun.substring(0, 4);
		// 단과 구하기
		char dan = hakbun.charAt(4);
		String 단과, 학과;
		단과 = "";
		학과 = "";
		String collage = "";
		// 학과 구하기
		String clas = hakbun.substring(5, 7);

		if (dan == '1') {
			단과 = "공대";
			if (clas.equals("11")) {
				학과 = "컴퓨터학과";
			} else if (clas.equals("12")) {
				학과 = "소프트웨어학과";
			} else if (clas.equals("13")) {
				학과 = "모바일학과";
			} else if (clas.equals("22")) {
				학과 = "자바학과";
			} else if (clas.equals("33")) {
				학과 = "서버학과";

			}

		} else if (dan == '2') {
			단과 = "사회대";
			if (clas.equals("11")) {
				학과 = "사회학과";
			} else if (clas.equals("12")) {
				학과 = "경영학과";
			} else if (clas.equals("13")) {
				학과 = "경제학과";

			}

		}

		// 결과 출력
		String result = hakbun + "는 " + year + "년도에 입학한" + 단과 + 학과 + "학생입니다";

		System.out.println(result);

	}
}
