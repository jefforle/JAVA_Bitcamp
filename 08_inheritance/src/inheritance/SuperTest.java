package inheritance;

public class SuperTest {

//	private double weight, height;//private이면, 자식클래스에서 접근X
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest 기본생성자");
	}
	
	public SuperTest(double weight, double height) {
		System.out.println("SuperTest 생성자");
		this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println("몸무게=" + weight);
		System.out.println("키=" + height);
	}
	
}


