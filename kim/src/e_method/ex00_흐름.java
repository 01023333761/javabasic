package e_method;

public class ex00_흐름 {

	
	static void method() {
		 System.out.println("method 실행");	
	}
	
	
	
	public static void main(String[] args) {
	
          System.out.println(" main 시작");
          method();
          method();
          method();
          System.out.println(" main 끝");
	}
	}
