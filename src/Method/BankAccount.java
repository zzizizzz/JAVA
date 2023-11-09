package Method;

public class BankAccount {
	
	//멤버 변수 (인스턴스 변수) 정의하기
	String owner;      		//예금주
	String accNo;      		//계좌번호
	int password;      		//비밀번호
	long balance;      		//현재 잔액
	double interestRate;    //이율
	
	//생성자 정의하기
	public BankAccount(String owner,String accNo,int password,
			long balance, double interestRate) {
		this.owner = owner;
		this.accNo = accNo;
		this.password = password;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	/**
	 * 계좌 정보를 화면에 출력한다. 
	 */
	// 맴버메소드 정의하기
	public void display() {
		System.out.println("###계좌정보");
		System.out.println("예금주 : " +owner);
		System.out.println("계좌번호 : " +accNo);
		System.out.println("현재잔액 : " +balance);
		
	}
	/**
	 * 입금액을 전달받아서, 계좌의잔액을 입금액만큼 증가시킨다.
	 * @param amount 입금액
	 */
	public void deposit(int amount) {
		System.out.println("###입금액 : " + amount);
		balance += amount;
		
		System.out.println("###입금후 잔액 : " +balance );
		System.out.println("###입금이 완료되었습니다.");
		
		
	}
	/**
	 * 출금요구 금액, 비밀번호를 전달받아서 인증이 완료되면 요구금액만큼 출금액을 반환한다.
	 * @param amount 출금요구금액
	 * @param pwd 비밀번호
	 * @return 출금액, 비밀번호가 일치하지 않으면 출금액은 0이다.
	 */

	public long withdraw(int amount, int pwd) {
		//빠른 종료 , 나쁜경우를 먼저 찾아서 제거하자
		if(password != pwd) {
			System.out.println("###비밀번호가 일치하지 않습니다.");
			return 0;
			
		}
		
		balance -= amount;
		System.out.println("### 출금 후 잔액 : " + balance);
		
		return amount;
		
	}
	/**
	 * 이전 비밀번호와 새비밀번호를 전달받아서 비밀번호를 변경합니다.
	 * 이전 비밀번호와 비밀번호가 일치하고, 새비밀번호와 이전비밀번호가
	 * 서로 다른 경우에만 비밀번호를 변경한다.
	 * @param oldPwd 이전 비밀번호
	 * @param newPwd 새로운 비밀번호
	 */
	public void changePassword(int oldPwd, int newPwd) {
		if (oldPwd !=password) {
			System.out.println("### 비밀번호 변경 실패 : 비밀번호가 일치하지 않습니다.");
			return;
		}
		
		if ( oldPwd == newPwd) {
			System.out.println("### 비밀번호 변경 실패 : 기존비밀번호와 같은 비밀번호로 변경할수 없습니다.");
			return;
		}
		password = newPwd;
		System.out.println("### 비밀번호 변경이 완료되었습니다.");
	}
	
	/**
	 * 비밀번호를 전달받아서, 계좌를 해지시킨다. 해지가 완료되면 해지환급금을 반환한다.
	 * @param pwd 비밀번호 
	 * @return 해지 환급금, 현재 잔액에 이율을 적용한 금액이다.
	 */
	public long terminate(int pwd) {
		if (pwd !=password) {
			System.out.println("###비밀번호가 일치하지 않습니다.");
			return 0;
		}
		System.out.println("### 제좌가 해지처리 되었습니다.");
		
		long amount = balance + balance + (long)(balance*interestRate);
		return amount;
	}
}
