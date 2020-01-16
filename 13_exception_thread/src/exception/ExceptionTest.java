package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		if(args.length!=0) System.out.println("args[0] = " + args[0]);
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("숫자입력:");
			int num2 = scan.nextInt();
			int num = Integer.parseInt(args[0]);
			System.out.println(num+"/"+num2+"="+num/num2);
		}catch(ArithmeticException e) { //에러메세지 바꿈
			System.out.println("0으로 나누면 안됨");
		}catch(InputMismatchException e) { //에러를 잡는게 아니라 잡아서 메세지만 바꿔준것
			System.out.println("숫자만 입력해라");
		}finally {
			System.out.println("error가 있건없건 무조건 실행");
		}
	} 

}
//사실 ArithmeticException와 같은 컴파일 에러는 try~catch로 잘 안잡음