package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제3]
초를 입력받아서 time()에서 시,분,초를 구하여 출력한다

[실행결과]
초를 입력하시오 : 3850
1시간 4분 10초 입니다
 */

public class Pratice3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Pratice3 p3 = new Pratice3();
		System.out.print("초 입력 : ");
		int sec = Integer.parseInt(br.readLine());
		
		p3.time(sec);
		
	}
	public int time(sec) {
		int hour = second / 3600;  //1시간 = 3600초
		int minute = second % 3600 / 60; //1분 = 60초
		int second = second % 3600 % 60;

		System.out.println(hour+"시간"+minute+"분"+second+"초");
		
	}

}
