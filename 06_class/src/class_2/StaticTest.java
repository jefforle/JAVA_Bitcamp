package class_2;

public class StaticTest {
	private int a; //필드, 인스턴스변수
	private static int b; //필드, 클래스변수
	
	static {
		System.out.println("static 초기화 영역");
		b=3;
	}
	public StaticTest() {//생성자: 클래스 초기화
		a=3;
	}
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a="+a+"\t b="+b);
	}
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a="+this.a+"\t b="+b); --ERROR. static메소드안에서는 일반변수/일반메소드를 사용할수 X
	}
	
	

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output(); //new할필요 없이 클래스명으로 직접 호출가능
		output(); 
		st.output();

	}

}
// 함수는 다 stack에 잡힘
//static 프로그램 종료될때 소멸(메모리에 프로그램이 종료될때가지 살이있다.)
//heap new / JVM
//stack 구역을 벗어날떄 소멸
//
//
//int a=5; //초기화
//
//int a; //a에는 
//a=5; //대입