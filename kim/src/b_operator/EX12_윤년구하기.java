package b_operator;

public class EX12_윤년구하기 {
	int isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 1; // 윤년일때 1 리턴 ( 여러 조건 동시실행시에 &&조건 우선적용)
		}
		return 0; // 평년일때 0 리턴
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
