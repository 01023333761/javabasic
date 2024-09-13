package b_operator;
/*
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  >>
 *  <<
 *  >>>
 *  
 *  숫자2 1byte 적용한다면?
 *  
 *     2       00000010    
 *     2<<1    00000100
 *     2>>1    00000001
 *     
 *     2>>>1   00000001
 *             음수인 경우
 *             10000010     -  01000001
 *  
 */
public class EX_04_쉬프트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 4;       //0000000 0000000 0000000 0000100
	int result = a >> 2; //0000000 0000000 0000000 0000100
    System.out.println(("a>>2 한 결과:" + result));

    int result2;
    result2 = a << 2;
    System.out.println("a<<2 한 결과:" + result2);
    
    
    int b= -4;
    int re2 = b >>> 2;
    System.out.println("b>>2 한 "
    		+ "결과:" + re2);
    
    
    
	}

}
