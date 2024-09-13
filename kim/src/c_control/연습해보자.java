package c_control;

public class 연습해보자 {

	public static void main(String[] args) {
		
		String id = "801212-9234567";
		char sung = id.charAt(7);
		
		String gender = "";
		
		if( sung == '1' || sung == '3'|| sung =='9') {
			gender ="남자";
		}else if( sung == '2' || sung=='4' || sung=='0') {
			gender = "여자";
		
		} System.out.println("당신은" + gender +"입니다");
				

	}


        String tel = "02-222-2222";
        int idx = tel.indexOf('-');
        






}





