package inheritance;

//class EnumColor{
//	static final String RED = "빨강";
//	static final String GREEN = "초록";
//	static final String BLUE = "파랑";
//	static final String MAGENTA = "보라";
//}

enum EnumColor{ //상수들을 나열해서 쓰겠다. -> 클래스X, 위의 예시처럼 일일이 기재하지 않아도 상수화 시킬수 있음
	RED, GREEN, BLUE, MAGENTA
}

public class EnumMain {
	String colorName;
	EnumColor color;

	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		System.out.println();
		
		EnumMain em = new EnumMain();
		em.colorName = "빨";
		em.color = EnumColor.RED; //이 방법을 제일 많이 씀
		System.out.println(em.colorName+"\t"+em.color);
		
		em.colorName = "보라";
		EnumColor VIOLET = EnumColor.MAGENTA;
		System.out.println(em.colorName+"\t"+VIOLET);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {
			System.out.println(data + "\t"
								+ data.ordinal() +"\t"
								+ data.valueOf(data+""));
		}

	}

}
