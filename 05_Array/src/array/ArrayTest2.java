package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int)(Math.random()*4+2); //2~5
		
		String[] ar = new String[size]; 
		
		System.out.println("배열명 ar=" +ar);
		System.out.println("배열크기="+ar.length); //length => 명령어, 배열의 크기, 배열의 크기구하는것만 괄호() 없음
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("과일명 입력:");
			ar[i] = br.readLine();
		}
		
		for(String data : ar) {
			System.out.println(data);
			System.out.println("첫번째 문자="+data.charAt(0));
			System.out.println("문자열 크기="+data.length());//length() => 함수, 문자열의 크기
		}

	}

}
