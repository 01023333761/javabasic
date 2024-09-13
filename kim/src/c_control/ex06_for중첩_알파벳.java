package c_control;

public class ex06_for중첩_알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//알파벳 A부터 Z까지 한줄에 출력
		
		
		for(int i=0; i<26 ; i++) { // 26줄
			for(char ch=(char)('A'+i) ; ch<='Z'+ i ; ch++) { //알파벳출력
			System.out.println(ch);
		}
			
		System.out.println();
		}
		
		
		
		
		
		
	}

}
