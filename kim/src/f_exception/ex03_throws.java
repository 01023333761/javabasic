package f_exception;

import java.io.FileInputStream;

public class ex03_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
		readfile();
		System.out.println("파일처리성공");
         }catch(Exception ex) {
        	 System.out.println("예외발생:" + ex.getMessage());
        	 //ex.printStackTrace();
         }
		
	}
   
	static void readfile() throws Exception{
		FileInputStream fis = null;
		try {
	    fis = new FileInputStream("happy.txt");
}finally {
	fis.close();
}
	}	
	}
   
   

