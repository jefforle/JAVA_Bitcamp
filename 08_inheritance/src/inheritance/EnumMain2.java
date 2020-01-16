package inheritance;

enum EnumColor2{
	//enum 괄호안의 데이터는 생성자로 전달된다.
	RED("빨강"), GREEN("초록"), BLUE("파랑"), MAGENTA("보라");
	
	private String colorName;
	
  //public EnumColor2(String colorName){ --Error. 외부에서 new해서 생성하는 애들이 아니라서 
	EnumColor2(String colorName){ 
		this.colorName = colorName;
	}
	public String getColorName() {
		return colorName;
	}
}

public class EnumMain2 {

	public static void main(String[] args) {
		System.out.println(EnumColor2.RED);
		System.out.println();
		
		for(EnumColor data : EnumColor.values()) {
			System.out.println(data + "\t"
								+ data.ordinal() +"\t"
								+ data.getColorName(data+""));
		}

	}

}
