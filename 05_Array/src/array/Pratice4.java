package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제4] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
 */

public class Pratice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		String yn = null;
		int strike, ball=0;
		String inputStr;
		
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9+1);
			//System.out.print(com[i]);
		}
		System.out.print(com[0] + com[1] + com[2] );
		System.out.println();
		
		while(true) {
			//while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n")) {
				System.out.print("게임을 실행하시겠습니까(Y/N) :");
				yn = br.readLine();			
				if(yn.equals("N") || yn.contentEquals("n")) break;
				if(yn.equals("Y") || yn.contentEquals("y")) {
					System.out.println("게임을 시작합니다");

					while(true) {
						System.out.print("숫자입력:");
						inputStr = br.readLine();
						
						//입력
						for(int i=0; i<user.length; i++) {
							user[i] = inputStr.charAt(i)-48;
						}
						System.out.print(user[0] + user[1] + user[2]);
						


						//비교
						strike = ball = 0;
						for(int i=0; i<com.length; i++) {
							for(int j=0; j<user.length; i++) {						
								if(com[i] == user[j]) {
									if(i == j)
										strike++;
									else 
										ball++;
								}
							//	System.out.println(strike+"스트라이크 "+ball+"볼");
									
							}						
						}
						System.out.println(strike+"스트라이크 "+ball+"볼");
					}
				}

			}
		
	}

}
