package overriding;

public class ColorPrinter extends Printer {
	
	//print의 ptint() 메소드를 재정의하였다.
	public void print() {
		System.out.println("컬러로 인쇄합니다.");
	}

}
