package overriding;

public class PCApp {
	public static void main(String[] args) {
		
	
	// 다양한 프린터 객체를 준비한다.
	Printer p1 = new Printer();
	ColorPrinter p2 = new ColorPrinter();
	Photoprinter p3 = new Photoprinter();
	
	//컴퓨터 객체를 준비한다.
	PC pc = new PC();

	//컴퓨터 객체와 프린터 객체를 조립한다.
	pc.p = p2;
	//문서를 인쇄합니다.
	pc.printDocument();
	}
}
