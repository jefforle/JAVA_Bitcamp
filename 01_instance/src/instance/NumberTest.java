package instance;

/*
 * 문제
 * 320, 258을 변수에 저장하여 합을 구하시오
 * 
 * [실행결과]
 * 320 + 258 = xxx
 * 320 - 258 = xxx 
 * 320 * 258 = xxx
 * 320 / 258 = xxx
 */


public class NumberTest {

	public static void main(String[] args) {
		
		int num1 = 320;
		int num2 = 258;
		int sum, sub, mul;
		double div;
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = (double)num1 / num2;
		
		 
		System.out.println("320 + 258 = " + sum);
		System.out.println("320 - 258 = " + sub);
		System.out.println("320 * 258 = " + mul);
		System.out.println("320 / 258 = " + String.format("%.2f", div));
		
		
		
	}

}
