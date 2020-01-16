package array;
/*
 //함수로 빼서 코딩하기 main함수는 호출만
 배열의 크기를 입력받아서 배열을 생성하고 데이터 입력 후 출력하시오
 
[실행결과]
배열크기 : 3
ar[0]:25
ar[1]:36
ar[2]:-78

25 36 -78
합 = xxx
최대값 = 
최소값 = 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열크기:");
		int size = Integer.parseInt(br.readLine());		
		int[] ar = new int[size];
		
		ArrayTest3 at = new ArrayTest3();
		int sum = at.input(ar);
		int max = at.big(ar);
		int min = at.small(ar);
		at.output(ar, sum, max, min);
		
	}
	public int input(int[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;		
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar["+i+"]:");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
		}
		return sum;
	}
	
	private int big(int[] ar) throws IOException {
		int max = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) 
				max = ar[i];
		}
		return max;
	}
	private int small(int[] ar) throws IOException {
		int min = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i] < min) 
				min = ar[i];
		}
		return min;
	}
	private void output(int[] ar, int sum, int max, int min) {
		for(int data : ar) {
			System.out.print(data+" ");		
		}
		System.out.println();
		System.out.println("합="+sum);
		System.out.println("최대값="+max);
		System.out.println("최소값="+min);
	}
		
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열크기:");
		int size = Integer.parseInt(br.readLine());		
		int[] ar = new int[size];
		int sum = 0;
		int max, min;
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("ar["+i+"]:");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
		}
		
		for(int data : ar) {
			System.out.print(data+" ");
//			sum += data;
		}
		System.out.println("합="+sum);
		
		max = min = ar[0];
		for(int i=1; i<size; i++) {
			if(ar[i] > max) 
				max = ar[i];
			if(ar[i] > min) 
				min = ar[i];
		}
*/		
		
		

	

}
