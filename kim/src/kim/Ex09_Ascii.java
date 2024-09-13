package kim;

/*
 *  c언어의 문자 : Ascii_code
 *              한글자를 1B(8bit)로 표현
 *              256개 문자표현
 *  java언어의 문자 : unicode ( with ascii-code ) 
 *                한글자를 2B(16bit)로 표현
 *                65535개 문자표현
 */

/* 메모리 단위 
 *             1BIT : 0(off) / 1(on)
 *             8bit = 1Byte
 *             1024B = 1KB
 *             1024KB = 1MB
 *             1024MB = 1GB
 *             1024GB = 1TB
 *             
 *             [십진수]
 *             
 *             365 = 3 * 10(2) + 6 * 10(1) +5 *10(0)
 *                 = 3 * 100 + 6 * 10 + 5 *1
 *                 = 300 + 60 + 5
 *             [이진수] 숫자 2개 : 0,1
 *                 11010 = 1 * 2(4) + 1*2(3) + 1*2(2) + 1* 2(1) + 0*2(0)
 *                       =1 * 16 + 1*8 +0*4+ 1*2+0*1
 *                       =26
 *             [16진수] 숫자 16개 : 0,1,2,3,4,5,6,7,8,9 + A, B, C, D, E, F
 *                       
 *                           6F = 6* 16(1) + F * 16(0)
 *                              =6* 16 + 15 * 1
 *                              =96 + 15
 *                              =111
 */
public class Ex09_Ascii {

	public static void main(String[] args) {

		int a; // 4B 정수

		a = 'a';// 4B 변수에 2B 값 지정
		System.out.println(a);

		char ch = (char) 70;
		System.out.println(ch);

	}
}
/*
 * [Ascii-code] 1B = 8bit
 * 
 * 
 * 
 * 
 * 0 1 0 0 대문자 0 0 0 1 A
 * 
 * 
 * 0 1 0 0 0 0 1 0 B 0 1 0 0 0 0 1 1 C
 * 
 * A : 0100001 = 1*2(6) + 1*2(0) = 64 + 1 = 65
 * 
 * 
 * 
 * 소문자 a 0 1 1 0 0 0 0 1
 * 
 * 
 * 
 * 
 * 
 */
