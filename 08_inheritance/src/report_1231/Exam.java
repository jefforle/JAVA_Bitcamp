package report_1231;

import java.util.Scanner;

public class Exam {
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";//정답-상수화
//	public static final String JUNG="11111"; -이렇게 잡아주는게 더 맞음
	
	public Exam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력:");
		name = sc.next();
		System.out.print("답 입력:");
		dap = sc.next();
//		compare();
	}
	
	public void compare() {//비교
		ox = new char[5];
		for(int i=0; i<JUNG.length(); i++) {
			if(JUNG.charAt(i) == dap.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}
			else {
				ox[i] = 'X';
			}
		}
	}
	
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}

}
