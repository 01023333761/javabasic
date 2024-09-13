package b_operator;

public class ex13_복습 {

	public static void main(String[] args) {
		
		//국어점수 = 45
		int kor=45;
		//영어점수 = 67
		int eng=67;
		//수학점수 = 77
		int math=77;
		// 총점이 150보다 크고 250보다 작으면 '보통반입니다' 출력
		
	    int total = kor + eng + math;
	    
		if(total > 150 && total < 250) {
	    System.out.println("보통반입니다");
		
		//if ( 150 < total < 250) {
				System.out.println("보통반입니다");
			}

}
}

