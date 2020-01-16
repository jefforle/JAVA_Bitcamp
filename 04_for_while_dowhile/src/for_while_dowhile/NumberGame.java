package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ★★★ 숫자맞추기 게임★★★
 * 1~100사이의 난수를 발생하여 맞추는 게임
 * 변수명: com, user
 */

public class NumberGame { 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do { // 또할래(Y/N)? ==> 반복되는 시점이 중요 "난수~답"까지를 반복
			int com = (int) (Math.random() * 100) + 1; // 1~100사이의 난수
			System.out.println(com);
			int count = 0; //count는 새로 시작할때마다 초기화해줘야 함

			while (true) {
				count++;
				System.out.println("숫자입력 : ");
				int user = Integer.parseInt(br.readLine());

				if (user > com)
					System.out.println(user + "보다 작습니다.");
				else
					System.out.println(user + "보다 큽니다.");

				if (user == com)
					break; // 이조건일때 while을 벗어나라!
			}
			System.out.println(count + "번만에 맞추셨습니다!");

			System.out.println("또할래(Y/N)?");
			String again = br.readLine();
			if (again.equals("N") || again.equals("n"))
				break; // do~while 벗어나라!

		} while (true);

	}

}
