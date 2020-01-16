package interface_1;

public interface InterA {//인터페이스:상수와 추상메소드만 있을 수 있음, 인터페이스만 static final이 생략되도 됨
	public static final String NAME="홍길동"; //상수
	int AGE=25;
	
	public abstract void aa(); //추상메소드
	public void bb();
	
//	public void aa() { //클래스만이 메소드의 구현부(바디)를 가질수 있음
//		
//	}
}
