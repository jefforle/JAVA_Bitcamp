/* 1/14 (화) 3 */
package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int size = (int) file.length(); //파일 크기
		byte[] ar = new byte[size]; 
		
		bis.read(ar, 0, size); //데이터를 파일로 만들어서 한꺼번에 읽어들이겠다.
		
		//System.out.println(ar); 주소값 출력 => 배열의 데이터 읽으려면 확장형for문 돌리거나 string으로 변환
		//System.out.println(ar+""); 안됨 => 배열의 주소값을 문자열로 가져옴
		System.out.println(new String(ar)); 
		
		bis.close();

	}

}
