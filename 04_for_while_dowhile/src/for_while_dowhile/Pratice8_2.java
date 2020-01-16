package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pratice8_2 {
	//static int balance=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int balance=0;
		//balance는 데이터를 전달, 데이터 변경 후 리턴해줘야함
		//배열: 주소값을 전달함, 데이터 변경 후에도 리턴필요 X
		
		Pratice8 pt = new Pratice8();
		
		while(true) {
			System.out.println("****************");
			System.out.println("     1. 예금         ");
			System.out.println("     2. 출금         ");
			System.out.println("     3. 잔고         ");
			System.out.println("     4. 종료         ");
			System.out.println("****************");
			System.out.print("번호 선택 : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 4) break;
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
	private int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("예금액 : ");
		int in_value = Integer.parseInt(br.readLine());
		
		if(in_value % 10000 != 0)
			System.out.println("만원 단위로 입력하세요");
		else
			balance += in_value;
		return balance;
	}
	private int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("출금액 : ");
		int out_value = Integer.parseInt(br.readLine());	
		
		if(balance < out_value) {
			System.out.println("잔액이 부족합니다");		
		}
		else {
			balance -= out_value;
			System.out.println("당신의 잔액은 "+balance+"원 입니다");
		}
			
		return balance;
	}

}
