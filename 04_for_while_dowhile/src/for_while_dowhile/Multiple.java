package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 숫자를 입력하여 배수를 7개만 구하라
 * 단 음수이면 다시 입력하고 0이면 종료
 * 
 * [실행결과]
 * 숫자입력 : -7
 * 숫자입력 : 8
 * 8 16 24 32 40 48 56
 * 	power *= x;	
 * 8 = 8*1		
 * 16 = 8*2		
 * 24 = 8*3		
 * ...
 * 
 * 숫자 입력 : 0
 * 프로그램 종료
 */

public class Multiple {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) { //0이 입력될때까지 반복
			
			System.out.println("숫자입력 : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) break; //0이면 프로그램 종료
			if(num<0) continue; //음수면 숫자 재입력(while문 처음으로 되돌아감)
			
			for(int i=1; i<=7;i++) {
				System.out.print(num*i+" ");
			}
			System.out.println();
		}System.out.println("프로그램 종료"); //반복이 끝나면 프로그램 종료
		

	}

}
