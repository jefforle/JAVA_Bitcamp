/* 1/6(월) 1 */
package nested;

public class AbstractMain {
//클래스가 3개 숨어있음
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); //추상클래스라서  new할 수 없음
		//때문에 1.자식클래스로 상속시켜 오버라이드 해주거나, 2.메소드로 생성
		AbstractTest at = new AbstractTest() {//익명클래스(쓰는 이유? 상속을 안받고 한번만 쓰고 버리겠다.)
			//오버라이딩은 꼭 해줘야 함. 
			@Override
			public void setName(String name) {
				this.name = name;
			}		
		};	//세미콜론 필수!
		
		
		//interface는 new할 수 없음
		InterA aa = new InterA() { //여기서 new한것은 interface가 아니라 뒤에 있는 {};를 new(생성)한 것!!
			//interface는 implements할 수 도 있고 이처럼 익명으로 사용할 수 도 있다
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {};//추상
	}

}
