package method;

public class Boxing {

	public static void main(String[] args) {
		int a=25;
		double b = (double)a/3; //일시적 형변환
		
		String a = "25";
		int b = (int)a;
		
		int c = 5;
		Integer d = c; //AutoBoxing 기본형 -> 객체형 (자동형변환, 객체로 만들겠다!)
		//Integer d = new Integer(c); //JDK 1.5 이전
		
		Integer e = 5;
		int f = e; //unAutoBoxing 객체형 -> 기본형 (자동형변환, 기본형으로 반들겠다!)
		//int f = e.intValue(); //JDK 1.5 이전

	}

}
