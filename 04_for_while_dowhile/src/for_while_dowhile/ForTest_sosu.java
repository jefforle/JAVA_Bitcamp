package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 소수 - 1과 자기자신의 수
 * 소수 구하기
 * 단, 0이 입력되면 프로그램 종료
 * 
 * [실행결과]
 * 숫자입력 : 12
 * 12는 소수가 아니다
 * 
 * 숫자입력 : 13
 * 13은 소수이다
 * 
 * 숫자입력 : 0
 * 프로그램 종료
 * 
 */

public class ForTest_sosu {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(;;) {
			int sw=0;
			System.out.println("숫자입력 : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) break;
			
			for(int i=2; i<num; i++) {
				if(i%num == 0) sw=1;
			}
			if(sw==1)
				System.out.println(num+"은 소수");
			else
				System.out.println(num+"은 소수X");
		
		}

	}

}
