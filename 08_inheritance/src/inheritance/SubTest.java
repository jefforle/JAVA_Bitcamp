package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
	
	public SubTest() {
		System.out.println("SubTest 기본생성자");
	}
	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SubTest 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight; //this.weight = weight; 
		super.height = height; //this.height = height;
//		this : 내클래스
//		super : 부모클래스
	}
		
	public void output() {
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("몸부게="+weight);
		System.out.println("키="+height);
	
	}
	public static void main(String[] args) {
		SubTest aa = new SubTest("홍길동",25,79.5,185.3);
		//객체생성시 내것도 만들면서 부모것도 만듦(생성자 2번호출)
		
		aa.output();
		System.out.println("-------------------");
		aa.disp(); //나부터 찾고! 없으면 부모한테 찾는다
		System.out.println();
		
		SuperTest bb = new SubTest("또치",16,52.3,162); //SuperTest를 참조해라
		//bb.output(); Error. SuperTest클래스는 output()를 가지고 있지 않음
		
		
	}

}
