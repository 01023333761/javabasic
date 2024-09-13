package e_method;

import java.util.Scanner;

public class ex99_복습4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("인사말을 선택하세요");
		int a=input.nextInt();
		
		greeting(a);
   
	}
	
	/*
	 * 1. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여 결과값을 반환하는 
	 * subtract 메소드를 선언하고, 입력 받은 두 수를 인자로 보내서 그 메소드를 호출하여 결과값을 
	 * 출력하는 프로그램을 작성하시오.
	 * 
	 * 
	 */

	 static int  subtract( int a, int b) {
		  int result = a - b;
		  return result;
		
	 }
	 
	 
	 static void greeting( int a) {
		 switch(a) {
		 case 1 : System.out.println("안녕하세요");break;
		 case 2 : System.out.println("굿모닝");break;
		 case 3 : System.out.println("올라");break;
		 case 4 : System.out.println("곤니치와");break;
		 }
//		 int a = 12;
//	     switch( a/12) {
//	     case 1 : System.out.println("일"); //break;
//	     case 2 : System.out.println("이"); //break;
//	     case 3 : System.out.println("삼"); //break;
//	     case 4 : System.out.println("사"); //break;
//	     default : System.out.println("나머지");//break;
//	     }
//	     int b = 8;
//	     switch( b*3) {
//	     case 1 : System.out.println("이십일");// break;
//	     case 2 : System.out.println("이십이");// break;
//	     case 24 : System.out.println("이십사"); //break;
//	     default : System.out.println("임의의수");
		 
	 }
	   
	 
}

/*2. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 출력하는 메소드 greeting를 선언하고, 
 * 입력 받은 정수형 데이터를 인자로 보내서 그 메소드를 호출합니다.

단, 그 정수 데이터에 따라 다음과 같은 인사말을 출력합니다.

( 1-안녕하세요, 2-굿모닝, 3-올라, 4-곤니치와 )
 * 
 * 
 * 
 */
    

