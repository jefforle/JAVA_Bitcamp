package report_0108;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{
	private String name;
	private int id_num, kor, eng, math, total;
	private double average;
	
	public void calc() {
		total = kor + eng + math;
		average = (double)total/3;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId_num() {
		return id_num;
	}
	public void setId_num(int id_num) {
		this.id_num = id_num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return id_num +"\t"
				+name+"\t"
				+kor+"\t"
				+eng+"\t"
				+math+"\t"
				+total+"\t"
				+new DecimalFormat("#.##").format(average);
	}

	@Override
	public int compareTo(SungJukDTO dto) {
		//return name.compareTo(dto.getName()); //String클래스가 compareTo함수를 내장하고 있음
		if(total < dto.total) return 1; 
		else if(total == dto.total) return 0; 
		else return -1;
		
		
//		return total > dto.total ? -1 : 1;
	}

}
