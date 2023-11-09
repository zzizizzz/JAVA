package abstraction;

// 구현 클래스 정의하기
// 추상 메소드를 보유할 수 없다.
// 만약, 부모로부터 추상 메소드를 상속받았다면, 반드시 메소드재정의 해야한다.
public class LineChart extends Chart{
	
	
	@Override
	public void draw() {
		System.out.println("꺽은선 그래프를 그립니다.");
		
	}
		
		
	}


