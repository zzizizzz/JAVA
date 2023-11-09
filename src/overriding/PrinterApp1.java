package overriding;

public class PrinterApp1 {
	
	public static void main(String[] args) {
	
		Printer p1 = new Printer();
		p1.print();  //printer의 print()가 실행됨 
		
		ColorPrinter p2 = new ColorPrinter();
		p2.print();  //Colorprinter의 재정의된 print()가 실행됨
		
		Printer p3 = new ColorPrinter(); // ClorPrinter의 재정의된 Print()가 실행됨.
		p3.print();  					 // printer 객체를 참조하고 있어도 실제 생성한
		                                 // colorprinter객체의 재정의된 print()가 실행됨
			 							// 즉, printer타입의 참조변수로 자식 printer객체를 참조하고 있을때
										// print()를 실행하면 실제 생성된 객체에 재정의된 print()가 실행된다.
		// 실행에 다른 결과 - 다형성
		
	}

}
