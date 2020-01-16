package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수="+st.countTokens()); //3
		
		while(st.hasMoreTokens()) { // 1.토큰이 있다(T)/없다(F)
			System.out.println(st.nextToken()); // 2.토큰을 꺼내고 다음으로 이동
		}//StringTokenizer: 공백 무시
		
		String[] ar = str.split(","); //,로 분리하면 배열로 넣어라
		for(String data : ar) {
			System.out.println(data);
		}//split: 공백 인정

	}

}


// 배열.length
// 문자열.length()