package c_control;

import java.util.*;

public class ex05_for_연습{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 문제 1)1~ N까지의 숫자를 다음처럼 출력하라
	 *      1 2 3 4 5 
	 *      6 7 8 9 10
	 *      11 12 13 14 15
	 * 
	 * 
	 * 
	 */
		for(int i=1 ; i<=15 ; i++) {
			System.out.println(i + "  ");
			if( i%5==0) {
				System.out.println(); }
		}
				/*문제2)  문자열처리하기 

				문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 

				N이 대문자이면 문자 N부터  Z까지 출력하라 

				그 밖의 문자가 입력되면 Error 를 출력하라 

				​입력  출력

				f       abcdef

				X       XYZ
                
                6       error

				*/
					Scanner input = new Scanner(System.in);
                   System.out.println("문자 하나를 입력하세요 ->");
				//char ch = (char)i
                  
                   char ch = input.next().charAt(0);
                		   
                   
                 // 소문자인지 여부
                 if( ch>='a' & ch<='z') {
                	 for( char u='a'; u<=ch ; u++) 
                		 System.out.println(u);
                 }
                 else if( ch >='A' && ch<='Z') {
                		
                	 for( char u='A'; u<=ch ; u++)
                		System.out.println(u);
                 }
                 else if(ch >='A' && ch<='Z') {
                	 for(char ch2=ch; ch2<='Z'; ch++)
                	 System.out.println(ch2);
                 }
                 else
                	 System.out.println("error");
                 
                 
                 
                	 
                	 
                 
		
                 
                 
                 
                 
                 
                 
                 
                 
		}
	}

			
