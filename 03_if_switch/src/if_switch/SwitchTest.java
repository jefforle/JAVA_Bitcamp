package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("월 입력");
		int month = Integer.parseInt(br.readLine());
		int days=0; //초기화시켜주는 이유? 쓰레기값 담기는 것을 방지하기위해서
		
		switch(month) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 :
		case 10 : 
		case 12 : days = 31; break;
		case 2 : days = 28; break;
		case 4 : 
		case 6 :
		case 9 : 
		case 11 : days = 30; break;
		
		/*
		case 1 : days = 31; break;
		case 2 : days = 28; break;
		case 3 : days = 31; break;
		case 4 : days = 30; break;
		case 5 : days = 31; break;
		case 6 : days = 30; break;
		case 7 : days = 31; break;
		case 8 : days = 31; break;
		case 9 : days = 30; break;
		case 10 : days = 31; break;
		case 11 : days = 30; break;
		case 12 : days = 31; break;
		*/		
		}
		System.out.println(month+"월은"+days+"일입니다.");

	}

}
