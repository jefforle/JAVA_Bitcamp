package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제1]
정수(dec)를 입력받아서 2진수(binary), 8진수(octor), 16진수(hexa) 변환하시오
Integer클래스 메소드를 이용하시오

[실행결과]
10진수를 입력하세요 : 250

2진수 = 11111010
8진수 = 372
16진수 = fa
 */

public class Pratice1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10진수 입력 : ");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);
		String octor = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.print(binary +"\t"+ octor +"\t"+ hexa);
		

	}

}
