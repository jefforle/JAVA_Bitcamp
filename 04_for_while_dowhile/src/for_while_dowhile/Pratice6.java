package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����6]
����5������ ����2, ����3�� if������ ó���� ���� switch�� �ٲٽÿ�
 */
public class Pratice6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
		int mid_ex = Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		int final_ex = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է��Ͻÿ� : ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("�⼮������ �Է��Ͻÿ� : ");
		int attend = Integer.parseInt(br.readLine());
		
		double score = ((mid_ex + final_ex)/2)*0.6 + report*0.2 + attend*0.2;
		char grade;
		
//		if(score>=90) grade = 'A';
//		else if(score>=80) grade = 'B';
//		else if(score>=70) grade = 'C';
//		else if(score>=60) grade = 'D';
//		else grade = 'F';
		
		switch((int)score/10) {
		case 10 : grade = 'A'; break;
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F'; break;
		}		
		
		System.out.println("����="+ String.format("%.2f", score));
		System.out.println("����="+grade);
		
//		if(grade=='A' || grade=='B') System.out.println("Excellent");
//		else if(grade=='C' || grade=='D') System.out.println("good");
//		if(grade=='F') System.out.println("poor");
		
		switch(grade) {
		case 'A' : System.out.println("Excellent"); break;
		case 'B' : System.out.println("Excellent"); break;
		case 'C' : System.out.println("good"); break;
		case 'D' : System.out.println("good"); break;
		default : System.out.println("poor"); break;
		}

	}

}
