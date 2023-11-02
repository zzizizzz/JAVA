package day1;

public class BookApp {
	
	public static void main(String[] args) {
		/*
		 * 객체 생성하기
		 * 
		 * 형식 
		 *  new 클래스명 ();
		 *  
		 *  + 클래스명에 해당하는 객체를 생성하고,
		 *    생성된 객체의 주소값을 반환한다.
		 *  + 반환되는 주소값은 생성된 객체를 이용하기 위해서
		 *    참조변수에 대입해서 한다.
		 *    
		 * 참조변수를 생성하고 객체의 주소값을 저장하기
		 *   형식
		 *   	클래스명 참조변수명 = new 클래스명();
		 *   
		 *   	+ 참조변수의 타입은 생성한 객체의 클래스명이다.
		 *    	+ 클래스명은 참조변수의 타입이다.
		 *    	+ 클래스는 사용자정의 데이터타입이(자료형)다.
		 *  
		 */
		
		
		//Book 클래스로 Book 객체 생성하기
		//아래와 같이 실행하면, Book 설계도를 이용해서 3개의 Book객체가 생성된다.
		Book book1 = new Book(); //Book객체 생성   new Book -> Book book1주소값
		Book book2 = new Book(); //Book객체 생성   new Book -> Book book2주소값
		Book book3 = new Book(); //Book객체 생성   new Book -> Book book3주소값
		Book book4 = book3;  // 같은객체를 바라본다. book4 -> book3을 바라본다.(참조변수 book3가 참조하는 객체와 같은 게체를 
		                     // 참조변수 book4가 참조하게된다.
		//참조변수 book5는 String 클래스를 생성하는 객체를 참조 할수 있기 때문에
		//Book객체를 참조 할수 없다.
		//String book5 = new book(); //오류발생
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		
	}

}
