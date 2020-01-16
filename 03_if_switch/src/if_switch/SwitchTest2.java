package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
 * a값 입력 : 25
 * b값 입력 : 36
 * 연산자(+,-,*,/) 입력 : / 
 * 25 / 36 = xx.xxx
 * 
 * cf. 연산자에 $ 입력할 경우
 * 연산자 error
 */

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		String op = br.readLine();
		
		//if(op.equals("+"))  --문자열은 "=="로 비교할 수 없음!
		switch(op) {
		case "+" : System.out.println(a+op+b+"="+(a+b)); break;
		case "-" : System.out.println(a+op+b+"="+(a-b)); break;
		case "*" : System.out.println(a+op+b+"="+(a*b)); break;
		case "/" : 
			//System.out.println(a+op+b+"="+String.format("%.3f",(double)a/b)); break;
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a+op+b+"="+df.format((double)a/b));
			
			break;
		default : System.out.println("연산자 error");
		}
	
	}

}
