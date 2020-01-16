
public class Test {
	int b; //클래스변수, Test클래스 내에 모든 함수에서 사용 O 
	
	public static void main(String[] args) {
		int a; //지역변수, main()함수에서만 사용 O
	}
	public int comp() {
		int a; //전역변수, comp()함수에서만 사용 O

	}
}
