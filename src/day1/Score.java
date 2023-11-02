package day1;

/**
 * 학생의 성적정보를 표현하는 클래스다.
 */
public class Score {
	String name; //맴버변수name
	int kor;
	int eng;
	int math;
	int total;
	double average;
	/**
	 * 학생이름, 국어, 영어, 수학점수를 전달받아 멤버변수에 대입한다.
	 * 총점과 평균을 계산해서 해당 변수에 대입한다.
	 * @param name 학생이름
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 * 
	 */
	void setup(String name, int kor, int eng, int math) {  // this는 주소값이 있으므로 맨위에잇는 값을 따라간다.
		this.name = name;
		this.kor = kor; //가까운 매개변수를 따라간다.
		this.eng = eng;
		this.math = math;
		this.total  = kor + eng + math;
		this.average  = this.total/3;
		
		
	}
	/**
	 * 성적정보를 출력한다.
	 */
	void printScore( ) {
		System.out.println("학생이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("종합점수 : " + total);
		System.out.println("평균점수 : " + average);
		System.out.println();
	}

}
