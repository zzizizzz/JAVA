package abstraction;

public class PhoneApp {

	public static void main(String[] args) {
		//NormalPhone 타입의 참조변수는 NormalPhone객체를 참조할수 있다.
		NormalPhone p1 = new NormalPhone();
		//Phone타입의 참조변수는  NormalPhone객체를 참조할수 있다.
		Phone p2 = new NormalPhone();
		
		//Iphone타입의 참조변수는 Iphone객체를 참조할수 ㅣㅇㅆ다.
		Iphone p3 = new Iphone();
		//SmartPhone 참조변수는 Iphone객체를 참조할수 잇다.
		SmartPhone p4 = new Iphone();
		//Phone 참조변수는 Iphone 객체를 참조할수 있다.
		Phone p5 = new Iphone();
		
		//p4는 게임, 인터넷만 있기때문에 나머지는 실행되지 x
		p4.game();
		p4.internet();
		//p4.call("010-111-2222");
		//p4.receive( );
		//p4.sms("010-1111-2222","안녕하세요");
		
		//p5.game();
		//p5.internet();
		p5.call("010-111-2222");
		p5.receive( );
		p5.sms("010-1111-2222", "안녕하세요");
		
	}
}



		