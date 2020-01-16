package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("ChildTest 기본생성자");
	}
	public ChildTest(String name, int age, double weight, double height) {
		//super(); -- 부모의 기본생성자
		super(weight,height); //부모의 기본생성자, 반드시 첫번째줄에 작성
		System.out.println("ChildTest 생성자");
		this.name = name;
		this.age = age;
//		super.weight = weight; 
//		super.height = height; 
		

	}
	public void disp() { 
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("몸부게="+weight);
		System.out.println("키="+height);
	
	}
	
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동",25,79.5,185.3);
		aa.disp(); //나부터 찾음
		
		SuperTest bb = new ChildTest("또치",16,52.3,162);
		bb.disp(); //오버라이드이기 때문에 나부터 찾음!
	}

}
