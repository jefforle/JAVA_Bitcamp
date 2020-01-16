package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오.
 * 
 * [실행결과]
 * a값 입력 : 78
 * b값 입력 : 25
 * c값 입력 : 36
 * 25	36	78
 */

public class IfTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if(a>b && a>c) {
			if(b>c) 
				System.out.println(a+"\n"+b+"\n"+c);
			else 
				System.out.println(a+"\n"+c+"\n"+b);
		}			
		else if(b>a && b>c) {
			if(a>c)
				System.out.println(b+"\n"+a+"\n"+c);
			else
				System.out.println(b+"\n"+c+"\n"+a);
		}
		else{ //if(c>a && c>b)
			System.out.println(c);
			if(b>a)
				System.out.println(b+"\n"+a);
			else
				System.out.println(a+"\n"+b);
		}

	}

}
