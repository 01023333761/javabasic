package c_control;
import java.util.Scanner;
public class gugudan_ex1 {

	public static void main(String[] args) {
		System.out.println("인수입력 : ");
		{Scanner scan = new Scanner(System.in);}
		int dan = scan.nextInt();
		System.out.println(dan+"단");
		System.out.println("----------");
		for(int i = 1 ; i <= 9; i++)
			System.out.println(dan+'*'+i+"="+(dan*1));
	}

}
