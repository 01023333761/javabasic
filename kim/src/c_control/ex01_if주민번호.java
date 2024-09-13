package c_control;
/*
 * 1    : int
 * '1'    : char
 * "1" : String 
 */
public class ex01_if주민번호 {
public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "801212-3234567";
		char sung = id.charAt(7);
		System.out.println(sung);
		
		String gender = "";
		// 그 문자가 1이거나 3이거나 9라면 '남자' 출력
		// 그 문자가 2이거나 4이거나 0라면 '여자' 출력

		if( sung == 1 || sung =='3' || sung=='9') {
			//System.out.println("남자");
		  gender = "남자";
		
		}else if( sung == 2 || sung=='4' || sung=='0') { 
			//System.out.println("여자");
		gender = "여자";
		}
		
		System.out.println("당신은 " + gender + "입니다");
	}
}


	
		
	

