package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
[문제3] 로또 
크기가 6개인 정수형 배열을 잡아서 1~45사이의 난수를 발생하여 저장 후 출력하시오
단, 숫자가 중복되면 안된다

input() - 난수 발생, 중복된 숫자가 나오면 다시 발생
output() - 출력
 */

public class Pratice3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
	     int[] iArray = randomInput(6);
	     randomOutput(iArray);
	    //Arrays.sort(iArray); //오름차순, sort() 내장함수가 static 함수기 때문에 "new iArray"할 필요X!! 
	     sort();
	   	System.out.print("현금입력:");
	   	int money = Integer.parseInt(br.readLine());
	   	
	   	for(int i=1; i<=money/1000; i++) {
	   		  randomInput(6);
	   		
	   	}	     
	}
	 

	private void sort() {
		//Selection Sort(선택정렬)
		for(int i=0; i<iArray.length-1; i++) {
			for(int j=i+1; j<iArray.length; j++) {
				if(iArray[i] > iArray[j]) { //오름차순, 내림차순(iArray[i] < iArray[j])
					int temp=0;
					temp = iArray[i];
					iArray[i] = iArray[j];
					iArray[j] = temp;
				}
			}
		}
		
	}


	// input()
	  public static int[] randomInput(int sizeNumber) {
	     int rNum;
	     int[] iArray = new int[sizeNumber]; // input 값 사이즈의 배열 생성
	     
	     for(int i=0; i<iArray.length; i++) { // 6번의 난수 발생
	        rNum = randomNumber(); // 난수발생 및 1-45 확인
	        for(int j=0; j<iArray.length; j++) { // 배열 내에 랜덤값과 중복되는 숫자가 있는지 확인
	           if(iArray[j]==rNum) {
	              rNum = randomNumber(); // 중복일 경우 난수 재발생
	           }
	        }
	        iArray[i] = rNum; // 난수를 배열에 input
	     }
	     return iArray;
	  }
	 
	  // output()
	  public static void randomOutput(int[] arrayData) { //데이터만 찍어주면 딤
	     for(int k=0; k<arrayData.length; k++) {
	        System.out.println((k+1) + "번째 번호 : " + arrayData[k]);
	     }
	  }
	  
	 
	  // 난수발생 함수 (조건:1-45 랜덤값)
	  public static int randomNumber() {
	     int rNum = (int)(Math.random()*45)+1;
	     return rNum;
	  }
}
