package instance;

/*
[문제5]
변수 score의 값이 2와 3의 공배수인지 아닌지를 출력하시오

[실행결과]
25는 2와 3의 공배수가 아니다 (score=25일때)
또는
12는 2와 3의 공배수이다 (score=12일때)
 */

public class Pratice5 {
	public static void main(String[] args) {
		int a = 2, b = 3;
		int score = 12;
		int gong = score%(a*b);
		
		if(gong != 0)
			System.out.println(score + "는 2와 3의 공배수가 아니다");
		else
			System.out.println(score + "는 2와 3의 공배수이다");
	}

}
