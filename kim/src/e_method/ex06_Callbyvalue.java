package e_method;
/*
 * call by value
 *          : 메소드의 인자(파라메터)가 기본형인 경우
 *          = > 값만 복사
 */
public class ex06_Callbyvalue {

	public static void main(String[] args) {
	
		   int a = 10, b = 20 ;
		   
		   add(a, b);
		   System.out.println("2. A="+a+",B=" +b);
	}

	 static void add(int a, int b) {
		  a +=b; // a=a+b;
		  System.out.println("1. A="+a+",B=" +b);
	 }
}
