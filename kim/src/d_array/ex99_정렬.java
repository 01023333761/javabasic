package d_array;

public class ex99_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 int[] lotto = { 45, 2, 15, 27, 10, 42 };
                 
                 //버블정렬
                 for(int i= lotto.length -1 ; i>0 ; i-- ) {
                	  for ( int j=0; j<i ; j++ ) {
                          if ( lotto[j] > lotto[j+1]) {
                        	  int temp = lotto[j];
                        	  lotto[j] = lotto[j+1];
                        	  lotto[j+1] = temp;
                          }
                	  }
                 }
                 // 선택정렬, 삽입정렬
                 
                 
                 //출력
                 for(int a=0; a<lotto.length; a++) {
                	 System.out.println(lotto[a] + "");
                 }
	}

                
	
}
//두 변수의 값 맞바꾸기(swapping)
		/*      int a = 5, b = 6;
		 *      int temp = a;  // 정수형 변수 temp를 만들면서 그 변수에 a 대입
		 *      a = b;           //a에 b 값 대입
		 *      b = temp;      //b에 temp 값 대입
		 * 
		 */
/* [예시] bubble sort
 * 
 * [원리] insert sort
 *         select sort
 * 
 * 
 */
