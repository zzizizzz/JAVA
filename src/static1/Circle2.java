package static1;

public class Circle2 {
	
	// 멤버변수 
	// 원의 반지름은 Circle 객체마다 서로 다른값을 가지기 떄문에 멤버변수로 정의한다.
	double r;
	
	// 정적변수
	// 원주율 Circle의 종류에 상관없이 항상3.14다.(상수값이다.)
	static final double PI = 3.14; // final키워드가 붙어있으면 변수의 값을 변경할수 없다. 상수값에는 변수명을 대문자로 갖는다.

	public Circle2(double r) {
		this.r =r;
	}
	public double around ( ) {
		return 2*PI*r;
		
	}
	public double area () {
		return PI*r*r;
	}
	

}
