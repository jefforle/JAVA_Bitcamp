package array;
/*
[문제2]
10진수를 입력하여 2진수로 변환하시오
0이 입력되면 프로그램을 종료하세요
음수가 입력되면 재입력하세요
4개씩 끊어서 보여주기
Integer.toBinaryString() 쓰지마삼

[실행결과]
10진수 입력 : -5

10진수 입력 : 250
1111 1010 

10진수 입력 : 12
1100

10진수 입력 : 0
프로그램을 종료
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pratice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ar = new int[32]; //배열의 초기값은 쓰레기값이 아닌 '0'이 들어있음

		while(true) { //for( ; ; )
			System.out.print("10진수 입력:");
			int num = Integer.parseInt(br.readLine());			

			if(num == 0) break;
			if(num < 0) continue;//continue안쓰려면 if(num>0){ (어딜감쌀지 잘보고) } 해주면 됨, 
			
			for(int i=0; num!=0; i++) { //for(int i=0; i<ar.length; i++)처럼 ar.length까지 굳이 갈필요 없음
				ar[i] = num % 2;
				num /= 2;
			}
			

			for(int i=ar.length-1; i>=0; i--) {
				System.out.print(ar[i]);		
				if(i%4 == 0)
					System.out.print(" ");
			}
			System.out.println();
			System.out.println();	
		}
		System.out.println("프로그램 종료");

	}	

}
