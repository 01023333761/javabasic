package e_method;

public class ex06_callbystring {

public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("하이");
		
		add(a, b);
		System.out.println("2. A="+a+",B="+b);
	}
	static void add(String a, String b) {
		
	       a+=b;
	        System.out.println("1. A="+a+",B="+b);

}
}
