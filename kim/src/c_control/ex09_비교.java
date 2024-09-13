package c_control;

import java.util.Scanner;

public class ex09_비교 {

	public static void main(String[] args) {

		
//		Scanner input = new Scanner(System.in);
//		//-----------------[1] for 문이용
//		System.out.println("구구단 출력 몇번 반복 할까여");
//		int su = input.nextInt();
//		
//		for(int a=0;  a <su; a++) {
//		
//		for(int i=1; i<=9; i++) {
//			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);
//		}
//	
//	}
		
		//-------------------------[2] while 이용
		
//		while( true ) {
//		System.out.println("단 입력 ->");
//		int dan =  input.nextInt();
//		for(int i =1; i<=9; i++)
//			System.out.printf(" %d * %d = %d\n", dan, i, dan*1);
//	}
//	System.out.println("종료할까요?(Y/N)");
//	String answer = input.next();
//	if(answer.equals('Y') | answer.equals("y")) break;
	//------------[3] do ~ while 이용
		String aswer = "";
		do {
			System.out.println("단 입력->");
			int dan =  input.nextInt(); 
			for(int i =1; i<=9; i++) {
				System.out.printf(" %d * %d = %d \n", dan, i, dan*1);
			}
			System.out.println("다시할까요?(Y/N)");
			answer  =  input.next();
			
		 }while( answer.equals("Y") | answer.equals("y") );
	

}

	
		
	}
