package c_control;
/*
 *  break : 블럭을 벗어나는 문장
 *  continue : 블럭의 끝으로 이동하는 문장
 */
public class ex10_breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		END:
		for( int i=0; i<2; i++) {
		
		
		
		for(int j=0; j<3; j++) {
        	 if( j==1) break END; // continue; //
        	 System.out.printf("< %d, %d > \n", i,j);
         }
         System.out.println("데이타");
         }

}
}
