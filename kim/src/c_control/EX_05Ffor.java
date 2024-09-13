package c_control;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class EX_05Ffor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*
	
		int result = 0;    
		for(int a=1 ; a<=10000 ; a++) {
		    result = result + a;
		}
		System.out.println("결과:" + result);
	}
*/
		// 1부터 10까지의 홀수의 합과 짝수의 합을 구하기
		int odd =0, even=0;
	
		/*
		 * for(int i=1; i<=10; i++) {
		
			
			if(i%2 == 1) {
				odd +=i;
			}else {
				even += i;
			
		
		          }
		           */
		for(int i=1; i<=10; i+=2) {
			odd += i; // odd = odd+i;
			even += (i+1);
		System.out.println("홀수의 합:" +odd);
		System.out.println("짝수의 합:" +even);
		//for(int a=10; a>0 ; a=a-2) {
			//System.out.println(a);
		
			

	   //for(char ch='Z' ; ch>='A'; ch--) {
		 //  System.out.print(ch);
		   }
	   
			//	for(char ch='A'; ch<='Z'; ch++) {
		//	System.out.println(ch);

		}}

		
	
