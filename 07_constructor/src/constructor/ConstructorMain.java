package constructor;

class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest() { // =>public void ConstructorTest()는 기본 메소드
		System.out.println("기본생성자");
	}
	public ConstructorTest(String name) {
		this(); //Overload된 다른생성자 호출
		//생성자 강제호출X but, 생성자가 생성자 호출하는 건 가능 
		this.name = name;
	}
	public ConstructorTest(int age) {
		this("코난"); 
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest aa = new ConstructorTest();
		System.out.println("이름="+aa.getName()+"\t나이="+aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동");
		System.out.println("이름="+bb.getName()+"\t나이="+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("이름="+cc.getName()+"\t나이="+cc.getAge());
		
		System.out.println();

	}

}

/*
public Test{
	private int a;
	
	public void setA(int a) {
		
	}
	public Test(int a) {
		
	}
	public Test() {} //default생성자
	//java에서는 생성자를 크게 쓰지 않음. C/C++에서는 신경써야함
	//java에서 필드는 자동으로 초기화되어 있음. 
}

class TestMain{
	
}
*/