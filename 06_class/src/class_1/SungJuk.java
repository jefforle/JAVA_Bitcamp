package class_1;

//메뉴판, Main함수에서 객체생성new 해줘야 함
public class SungJuk {//클래스의 기준은 무조건 1인분

	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;
	
	public void setName(String n) {
		name = n;
	}

	public void setKor(int n) {
		kor = n;
	}
	public void setEng(int n) {
		eng = n;
	}
	public void setMath(int n) {
		math = n;
	}
	public void calc() { //매개변수도 return값도 없음
		tot = kor + eng + math;
		avg = (double)tot / 3;
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public char getgrade() {
		return grade;
	}
	
}
