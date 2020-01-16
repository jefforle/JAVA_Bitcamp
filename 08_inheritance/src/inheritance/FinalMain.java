package inheritance;

class Final{
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "사자";
	public static final String ANIMAL2;
	
	public Final(){
		FRUIT2 = "딸기";
		//static은 생성자에서 초기화 안됨, static 초기화 구역은 따로있음
	}
	static { //static 초기화 구역
		ANIMAL2 = "기린";
	}
}

public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE++; --ERROR
		
		final int AGE2;
		AGE2 = 30;
		//AGE2 = 35; --ERROR
		Final f = new Final();
		
		System.out.println(f.FRUIT);
		System.out.println(f.FRUIT2);
		
		System.out.println(Final.ANIMAL);
		System.out.println(Final.ANIMAL2);

	}

}
