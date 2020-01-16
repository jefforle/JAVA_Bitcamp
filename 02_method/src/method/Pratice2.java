package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 [문제2]
주사위를 2번 던져서 나온 값의 합을 구하시오
주사위는 input()에서 1~6사이의 난수를 발생하여 리턴한다
합은 add()에서 구하여 리턴 받는다

[실행결과]
첫번째 주사위 값 : 3
두번째 주사위 값 : 6
합은 9 이다
 */

public class Pratice2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int num1 = (int)Math.random();
		//int num2 = (int)Math.random();
		Pratice2 pp = new Pratice2();
		
		int result = pp.add((int)Math.random(), (int)Math.random());
		
		System.out.println(result);

	}

	
	public int add (int num1, int num2) {
		return num1 + num2;	
	}

}
