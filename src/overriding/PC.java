package overriding;

public class PC {

	Printer p; // print 및 하위객체를 연결하는 잭역할
	
	public void printDocument() {
		p.print();
	}
}

