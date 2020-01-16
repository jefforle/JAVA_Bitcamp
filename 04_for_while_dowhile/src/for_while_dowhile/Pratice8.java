package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제8] 계좌관리 프로그램
예금, 출금, 잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하시오.
조건) 예금은 input(), 출금은 output()에서 처리하세요

[실행결과]
****************
   1. 예금
   2. 출금
   3. 잔고
   4. 종료
****************
번호 선택 : 1
예금액 : 10000
당신의 잔액은 10000원 입니다
또는
예금액 : 12000
만원 단위로 입력하세요

****************
   1. 예금
   2. 출금
   3. 잔고
   4. 종료
****************
번호 선택 : 2
출금액 : 8000
당신의 잔액은 2000원 입니다
또는 
출금액 : 18000
잔액이 부족합니다

1. 예금 2. 출금 3. 잔고 4. 종료
번호 선택 : 3
당신의 잔액은 2000원 입니다

1. 예금 2. 출금 3. 잔고 4. 종료
번호 선택 : 4
프로그램을 종료합니다.
 */
public class Pratice8 {
	static int balance=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Pratice8 pt = new Pratice8();
		
		for(;;) {
			System.out.println("****************");
			System.out.println("     1. 예금         ");
			System.out.println("     2. 출금         ");
			System.out.println("     3. 잔고         ");
			System.out.println("     4. 종료         ");
			System.out.println("****************");
					
		
			System.out.print("번호 선택 : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 1) {
				balance = pt.input(balance);
				System.out.println(balance);
			} else if(num==2) {
				balance = pt.output(balance);	
			} else if(num==3) 
				System.out.print("잔고 : "+balance+"\n");			 
			if(num == 4) break;
			System.out.println("당신의 잔액은 "+balance+"원 입니다");

		}
		System.out.print("종료");
		

	}
	public int input(int balance) throws IOException {  //예금
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("예금액 : ");
		int in_value = Integer.parseInt(br.readLine());
		
		if(in_value % 10000 != 0)
			System.out.println("만원 단위로 입력하세요");
	
		return balance + in_value;
	}
	
	public int output(int balance) throws IOException {  //출금
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("출금액 : ");
		int out_value = Integer.parseInt(br.readLine());		
		
		if(balance < out_value) {
			System.out.println("잔액이 부족합니다");
			
		}
		if(out_value % 10000 != 0) {
			System.out.println("만원 단위로 입력하세요");
			
			
		}
		return balance - out_value;
	}
}
