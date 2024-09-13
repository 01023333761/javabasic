package c_control;

import java.util.Calendar;

public class ex03_나이구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "800101-2123456";
		// String id = "010101-4123456";

		String nai = id.substring(0, 2); // nai = "80"
		int sunai = Integer.parseInt(nai); // 문자열 "80" -> int형 80
       // 올해년도 구하기
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int age = 0;
        char sung = id.charAt(7);
		if (sung == '1' || sung == '2') {
			// 성별문자가 '1'이거나 '2'라면
			age = year - (1900 + sunai) + 1;
		} else if (sung == '3' || sung == '4') {
			// 성별문자가 '3'이거나 '4'라면
            age = year - (2000 + sunai) + 1;
		}

		System.out.println("한국나이=" + age);
	}
}

/*
 * wrapper class : 자료형 클래스
 * 
 * int : Integer long : Long double : Double
 */