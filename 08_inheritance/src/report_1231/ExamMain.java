package report_1231;

import java.util.Scanner;

/*
[문제1]
* 클래스 : Exam
* 필드
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111";//정답-상수화

* 메소드
생성자
compare() - 비교
getName()
getOx()
getScore()

* 클래스 : ExamMain

[실행결과] // scanner로 입력받아주세요. 생성자에서
인원수 입력 : 3 --> main

이름 입력 : 홍길동  -->생성자
답 입력 : 13211

이름 입력 : 코난
답 입력 : 11111

이름 입력 : 또치
답 입력 : 13242

이름	 1 2 3 4 5	점수 --> sout은 다 main()
홍길동 O X X O O	60
코난	 O O O O O	100
또치	 O X X X X	20
 */


public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력:");
		int size = sc.nextInt();
		
		Exam[] ex = new Exam[size];
		for(int i=0; i<size; i++) {
			ex[i] = new Exam();
			ex[i].compare();
		}
		
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		
		
		for(Exam data : ex) {
			System.out.print(data.getName()+"\t");
			for(int i=0; i<ex[i].getOx().length; i++)
					System.out.print(data.getOx()[i] +"\t"); 
			System.out.println(data.getScore());
		}
		
//		for(int i=0; i<size; i++) {
//			System.out.print(ex[i].getName() +"\t");
//			for(int j=0; j<ex[i].getOx().length; j++) {
//				System.out.print(ex[i].getOx()[j] +"\t");
//			}
//			System.out.println(ex[i].getScore());
//		}

	}

}
