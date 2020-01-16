package abstract_1;

import java.util.Scanner;

abstract class ShapeTest{
	protected Scanner sc = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}
	public abstract void calcArea();//추상메소드: 상속시키니 모든 우선권이 자식에게 넘어감, 오버라이드된 부모클래스의 메소드는 이름만 필요하지 메모리에 잡을 필요 없으니 추상메소드가 필요
	public abstract void dispArea();
}
//-------------------------
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("가로:");
		base = sc.nextInt();
		System.out.print("세로:");
		height = sc.nextInt();
	}
	@Override //어노테이션, 개발자의 실수를 예방하기 위함
	public void calcArea() { //Override(모든 우선권이 자식에게), 부모의 calcArea()은 절대로 실행되지 X
		area = base*height/2.0;
	}
	@Override
	public void dispArea() { //Override, 부모의 disArea()은 절대로 실행되지 X
		System.out.println("삼각형 넓이=" + area); 
	}
}
//-------------------------
class SaTest extends ShapeTest{
	protected int width, height;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로:");
		width = sc.nextInt();
		System.out.print("세로:");
		height = sc.nextInt();
	}
	public void calcArea() {
		area = width*height;
	}
	public void dispArea() {
		System.out.println("사각형의 넓이="+area);
	}
}
//-------------------------
class SadariTest extends ShapeTest{
	protected int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변:");
		top = sc.nextInt();
		System.out.print("밑변:");
		bottom = sc.nextInt();
		System.out.print("세로:");
		height = sc.nextInt();
	}
	
	public void calcArea() {
		area = (top+bottom)*height;
	}
	public void dispArea() {
		System.out.println("사다리꼴의 넓이="+area);
	}
}
//-------------------------
public class ShapeMain {

	public static void main(String[] args) {
//		SamTest sam = new SamTest(); //부모생성자도 같이 생성, ShapeTest는 메모리에 3번 생성됨
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		SaTest sa = new SaTest();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//		
//		SadariTest sadari = new SadariTest();
//		sadari.calcArea();
//		sadari.dispArea();
//		System.out.println();
		
		
		ShapeTest shape;
		shape = new SamTest(); //결합도 낮추기, 부모는 자식클래스를 참조할 수 있고, 부모는 자식이게 맞춰가야함(다운캐스팅) => 부모=자식, 자식=(자식)부모
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
			
	}

}
