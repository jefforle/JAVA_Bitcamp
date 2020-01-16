package instance;

public class CompTest {
	public static void main(String[] args) {
		int score = 60;
		
		String result = score%2 == 0 ? "짝수" : "홀수";
		System.out.println(result); 
		
		int b = 80;
		result = score>b ? score+"" : b+"";  // +"" : 문자열로 형변환
		System.out.println(result);
		
		
	
		
		
		
	}
}
