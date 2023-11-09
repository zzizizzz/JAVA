package inheritance;

public class PhoneApp2 {
	public static void main(String[] args) {
		
		//Iphone 객체는 Iphone 타입이다.
		Iphone p1 = new Iphone(); //클래스 형변환 x (타입이같다)
		p1.appleMusic();    			//Iphone객체
		p1.applepay();					//Iphone객체
		p1.ip = "192.168.10.1";			//SmartPhone객체
		p1.internet();					//SmartPhone객체
		p1.game();						//SmartPhone객체
		p1.number = "010-1111-111";		//Iphone객체
		p1.call();						//Iphone객체
		p1.receive();					//Iphone객체
		
		// Iphone 객체는 SmartPhone 타입이다.
		SmartPhone p2 = new Iphone(); // 클래스 형변환o  // 객체와 참조변수가 다를 때 (Smart Phone / Iphone)
		//p2.appleMusic();    			//Iphone객체
		//p2.applepay();				//Iphone객체
		p2.ip = "192.168.10.1";			//SmartPhone객체
		p2.internet();					//SmartPhone객체
		p2.game();						//SmartPhone객체
		p2.number = "010-1111-111";		//Iphone객체
		p2.call();						//Iphone객체
		p2.receive();					//Iphone객체
		
		
		// Iphone 객체는 Phone타입이다.
		Phone p3 = new Iphone(); // 클래스 형변환o
		// 타입이 맞는 부모 객체를 바라보고 있으므로 오류가 나지 않는다. 
		//p3.appleMusic();    			//Iphone객체
		//p3.applepay();					//Iphone객체
		//p3.ip = "192.168.10.1";			//SmartPhone객체
		//p3.internet();					//SmartPhone객체
		//p3.game();						//SmartPhone객체
		p3.number = "010-1111-111";		//Iphone객체
		p3.call();						//Iphone객체
		p3.receive();					//Iphone객체
		
	
		
		
	}

}
