package instance;

public class Variable2 {
	int a; //field(쓰레기값 가지고있지 않음), 초기화, 인스턴스 변수
	static int b; //field, 초기화, 클래스변수
	String str;

	public static void main(String[] args) {
		int a = 20; //local variable(지역변수) - 모든 지역값은 가비지값을 가지고 있음 => 반드시 초기화
		System.out.println("지역 a = " + a);
		System.out.println("필드 a = " + new Variable2().a); //new Variable2()는 일회성, 영구적인 방법은 나중에 배움 
		System.out.println("필드 b = " + b);
		System.out.println("필드 str = " + new Variable2().str); 
		
		
		
		
		

	}

}
