package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제1] 가위바위보 게임 - if문

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 바위	나 : 보자기
You Win!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위	나 : 보자기
You Lose!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 2 (user)
컴퓨터 : 가위	나 : 가위
You Draw!!
또 할래(Y/N) : n
프로그램을 종료합니다
 */

public class Pratice1 {

	public static void main(String[] args) throws IOException {
		// for( ; ; ) OR while(true) //무한루프
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int user = Integer.parseInt(br.readLine());
		int com = (int) (Math.random() * 3) + 1;
		String again = br.readLine(); //반복여부 묻는 변수

		for( ; ; ) {
			if (com == 1) {// 컴퓨터가 가위일때
				if (user == 1) {
					System.out.println("컴퓨터:가위	나:가위");
					System.out.println("You Draw!");
				} else if (user == 2) {
					System.out.println("컴퓨터:가위	나:바위");
					System.out.println("You Win!");
				} else {
					System.out.println("컴퓨터:가위	나:보자기");
					System.out.println("You Lose!");
				}
			}
			if (com == 2) {// 컴퓨터가 바위일때
				if (user == 1) {
					System.out.println("컴퓨터:바위	나:가위");
					System.out.println("You Lose!");
				} else if (user == 2) {
					System.out.println("컴퓨터:바위	나:바위");
					System.out.println("You Draw!");
				} else {
					System.out.println("컴퓨터:바위	나:보자기");
					System.out.println("You Win!");
				}
			}
			if (com == 3) {// 컴퓨터가 보일때
				if (user == 1) {
					System.out.println("컴퓨터:보자기	나:가위");
					System.out.println("You Win!");
				} else if (user == 2) {
					System.out.println("컴퓨터:바위	나:바위");
					System.out.println("You Draw!");
				} else {
					System.out.println("컴퓨터:보자기	나:바위");
					System.out.println("You Lose!");
				}
			}
			
			System.out.println("또할래(Y/N)?");
//			String again = br.readLine();  //반복여부 묻는 변수(여기써도 되고, 위에써서 변수끼리 모아둬도 되고)
			if (again.equals("N") || again.equals("n")) 
				break; // for 벗어나라!
			
		} 
		System.out.println("종료");

	}

}
