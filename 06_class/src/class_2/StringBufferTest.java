package class_2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	
	public StringBufferTest() {
		//원하는 단 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단 입력 :");
		dan = sc.nextInt();
	}
	public void output() {
		StringBuffer sb = new StringBuffer();
		
		for(int i=1; i<=9; i++) {
			//System.out.println(dan+"*"+i+"="+dan*i);
			sb.append(dan); //append() : 그안의 문자열에 집어넣어라
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			
			System.out.println(sb.toString()); //sb만 찍어도 나오지만 (String클래스로 변환시킨 후 찍어라)
			sb.delete(0, sb.length()); //지워줘라
			
		}
	}

	public static void main(String[] args) {
		StringBufferTest sb = new StringBufferTest();
		sb.output();
		//new StringBufferTest().output(); --> new,생성자,output() 3개의 동작을 한번에

	}

}
