package array;
/*
주차장 관리 프로그램

menu()
**************
   1. 입차            input()
   2. 출차            output()
   3. 리스트         list()
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] ar = new boolean[5];

		//함수 호출
		ArrayTest4 at = new ArrayTest4();
		at.menu(ar);

		System.out.println("프로그램 종료");
	}
	private void menu(boolean[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("****************");
			System.out.println("     1. 입차         ");
			System.out.println("     2. 출차         ");
			System.out.println("     3. 리스트       ");
			System.out.println("     4. 종료         ");
			System.out.println("****************");
			System.out.print("      메뉴            ");
			int menu_num = Integer.parseInt(br.readLine());
			
			if(menu_num == 4)
				break;
			if(menu_num<1 || menu_num>4) {
				System.out.println("1~4만 입력가능");
				continue;
			}
			if(menu_num == 1) input(ar);
			else if(menu_num == 2) output(ar);
			else if(menu_num == 3) list(ar);
		}
		
				
	}
	private void input(boolean[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("위치 입력:"); 
		int index = Integer.parseInt(br.readLine());
		if(ar[index -1]) //ar[index-1] 자체가 true
			System.out.println(index+"위치에 이미 주차되어있습니다");
		else {
			ar[index-1] = true;
			System.out.println(index+"에 입차하였습니다.");
		}
			
	}
	private void output(boolean[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("위치 입력:"); 
		int index = Integer.parseInt(br.readLine());
		if(ar[index-1])
			System.out.println(index+"에 출차되었습니다.");
		else {
			ar[index-1] = false;
			System.out.println(index+"위치에 주차되어 있지않습니다");
		}
	}
	private void list(boolean[] ar) {
		for(int i=0; i<ar.length; i++)
			System.out.println(i+"번 위치:"+ar[i]); 
		
	}

}
