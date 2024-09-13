package c_control;

public class ex01_if전화번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tel = "02-222-2222";
		int idx = tel.indexOf('-');
		// System.out.println(idx);
String localnum = tel.substring(0, idx); // 0번째부터 idx(2)앞에까지의 문자열
		// System.out.println(localNum);
/*
		 * 
		 * 지역번호가 02라면 "서울" 출력 
		 * 그렇지 않고 지역변수가 032라면 "인천" 출력 
		 * 나머지는 "한국"출력
		 * 
		 */
		String local = "";
		if(localnum.equals("02")) {
		 local = "서울";
		} 
		else if(localnum.equals("032")) {
			local = "인천";
		System.out.println(local + "입니다");
		
		}
	}

}

/*
 * 02-222-2222 032-123-1234 051-555-9876 0505-123-1234
 */
