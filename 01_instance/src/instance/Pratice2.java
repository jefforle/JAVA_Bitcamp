package instance;

/*
[문제2] 삼각형넓이를 계산하시오 (base, height, area)
삼각형넓이 = (밑변 * 높이)/2

[실행결과]
**** 삼각형의 넓이 구하기  ****
밑변 :  10  
높이 :   3
넓이 :   XX.XX  	<--- 소수 2자리까지출력하시오
 */

public class Pratice2 {

	public static void main(String[] args) {
		int base=15, height=3;
		double area = ((double)base * height) / 2;
		
		System.out.println("밑변 : " + base);
		System.out.println("높이 : " + height);
		System.out.println("넓이 : " + String.format("%.2f", area));
		

	}

}
