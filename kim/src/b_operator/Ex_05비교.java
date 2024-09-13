package b_operator;

/*
 * 비교연산자
 * 
 *     >  >= < <=   == !=
 *     
 * 
 */
public class Ex_05비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 88, eng = 87, math = 77;
		// 총점, 평균을 구해서 변수에 저장하고 출력
		int total;

		total = kor + eng + math;
		double avg = (double) total / 3;
		System.out.println("총점 :" + total);
		System.out.println("평균 :" + avg);
		/*
		 * [학점구하기
		 * 
		 * 평균이 90점 이상이면 A학점 평균이 80이상 90미만이면 B학점 평균이 70이상 80미만이면 C학점
		 * 
		 * 
		 */
		if (avg >= 90) { // 만약에 avg 90 이상이라면
			System.out.println("A학점"); // 그렇다면 'A'학점 출력
		} else if (avg >= 80) { // 그렇지 않다면 만약에 AVG값이 80 이상이라면
			System.out.println("B학점"); // 그렇다면 'B'학점 출력
		} else if (avg >= 70) {
			System.out.println("C학점");
		}
	}
}
