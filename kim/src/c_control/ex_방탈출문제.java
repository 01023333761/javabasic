package c_control;

public class ex_방탈출문제 {

	public static void main(String[] args) {
		
	    int no=0;
		for(int i=1; i<=10000; i++) {
			int su = i;
			
			
			while(su!=0) {
				int na = su%10;
				
				if(na==8) {
					no++;
					
				}
				su = su/10;
			}
		}
		System.out.println(no + "개");
		
		
		
//		//for(int i=1; i<=50; i++) {
//			int su = i;
//			boolean su369 = false;
//			
//			while(su!=0) {
//				int na = su%10;
//				
//			if( na==3 | na==6 | na==9) {
//				System.out.print("짝");
//				su369 = true;
//			}
//			su = su / 10;
//			}
//		
//			if(!su369) System.out.println(i);
//			else System.out.println( );
	}

}
