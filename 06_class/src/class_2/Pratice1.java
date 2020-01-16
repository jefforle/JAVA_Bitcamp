package class_2;

/*
[문제1]
치환하는 프로그램을 작성하시오
String 클래스의 메소드(indexOf(), replace())를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
 */

import java.util.Scanner;

public class Pratice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0; //문자열의 위치
		int cnt=0; //치환횟수
		
		
		System.out.print("문자열 입력:");
		String str = sc.next();
		System.out.print("현재 문자열 입력:");
		String target = sc.next();
		System.out.print("바꿀 분자열 입력:");
		String change_str = sc.next();
		
		if(str.length() < target.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
			return; //함수를 빠져나가라(main()을 끝내라)
		}
		str = str.toLowerCase();
		target = target.toLowerCase();
		
		while((index=str.indexOf(target)) != -1) { //문자열이 있으면 반복문 수행(없으면 -1이면 반복문 종료)
			target += target.length();
			cnt++;
		}
		
		System.out.println(str.replace(target, change_str));
		System.out.println(cnt + "개 치환");

			
	//index, index+text.length		
	//str.indexOf(cur_str, str.indexOf(cur_str)+1); 
	

	}

}
