package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException{
		//이름, 국어, 영어, 수학를 입력 받아서 총점, 평균을 구하시오
		//총점을 calcTot()구해오기
		//평균은 calcAvg()구해오기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String str = br.readLine();	//Enter을 칠때까지 데이터를 받겠다.	
		System.out.print("국어 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 입력 : ");
		int math = Integer.parseInt(br.readLine());
		
		MethodTest3 mt = new MethodTest3();
		int tot = mt.calcTot(kor, eng, math);
		double avg = mt.calcAvg(tot);
	
	}
	
	public int calcTot(int kor, int eng, int math){
		return kor + eng + math;
	}
	public int calcAvg(int tot){
		return tot/3;
	}

}


