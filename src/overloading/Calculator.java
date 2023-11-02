package overloading;

public class Calculator {

	/**
	 * 정수 2개를 전달 받아서 덧셈을 수행하고, 그결과를 반환한다.
	 * @param x 첫번쨰 정수
	 * @param y 두번쨰 정수
	 * @return 덧셈결과값
	 */
	int sum (int x, int y) {
		System.out.println("(정수 + 정수)의 덧셈을 실행한다");
		int result = x + y;
		
		 return result;
	}
	/**
	 * 정수 3개를 전달받아서 덧셈을 수행하고 그결과를 반환한다.
	 * @param x 첫번째 정수
	 * @param y 두번째 정수
	 * @param z 세번째 정수
	 * @return 덧셈 결과값
	 */
	int sum (int x, int y, int z) {
		System.out.println("(정수 + 정수+정수)의 덧셈을 실행한다");
		int result  = x + y + z;
		
		return result;
	}
	/**
	 * 
	 * @param x 첫번째 실수
	 * @param y 두번쩨 시수
	 * @return 덧셈결과값
	 */
	double sum(double x, double y) {
		System.out.println("(실수 + 실수)의 덧셈을 실행한다.");
		double result = x + y;
		
		return result;
	}
	double sum(int x, double y) {
		System.out.println("(실수 + 정수)의 덧셈을 실행한다.");
		double result = x + y;
		
		return result;
		
	}
	
//  매개 변수의 이름 서로 다른 것은 매소드 중복정의의 요건이 될 수 없다.
//	double sum(int a, double b) {
//		System.out.println("(실수 + 실수)의 덧셈을 실행한다.");
//		double result = x + y;
//		
//		return result;
//		
//	}
	
	/* 매소드 중복정의 (Method Overloading)
	 *  - 하나의 클래스 안에 이름이 동일한 메소드를 여러개 정의하는 것이다.
	 *  - 목적
	 *  	+ 유사한 기능은 동일한 이름으로 일관되게 정의하자.
	 *  	+ 객체의 기능에 대한 사용성이 높아진다.
	 *  - 방법
	 *  	+ 매개변수의 갯수/타입을 다른 매소드(이름이 같은)와 다르게 정의하여야 한다.
	 * 
	 * 아이디와 비밀번호를 전달받아서 로그인 성공여부를 반환하는메소드
	 *  반환타입 : boolean, 성공여부
	 *  매개변수 : 아이디, 비밀번호
	 *  boolean login(String id, String password) {
	 *           ..
	 *   }
	 *   
	 *   아이디, 비밀번호, 이메일, 이름 등의 고객정보를 전달받아서데이터베이스에 저장하는 메소드
	 *   반환타입 : 없음
	 *   매개변수 : 아이디,비밀번호, 이메일,이름
	 *   void saveUser (String id, String password, String email, String name ) {
	 *   ........
	 *   }
	 *   
	 *   // 고객정보를 전달받아서 데이터 베이스에 저장하는 메소드
	 *   
	 *   반환타입 : 없음
	 *   매개변수 : 고객정보 
	 *   void saveCustomer (Customer customer) {
	 *        .........
	 *    }
	 *    
	 *    //고객의 아이디를 전달받아서 해당고객의 정보를 반환하는 메소드
	 *    
	 *    반환타입 : Customer , 고객정보
	 *    매개변수 : 고객아이디
	 *    Customer getCustomerById(String id) {
	 *    .......
	 *    }
	 *        
	 *           
	 */

}
