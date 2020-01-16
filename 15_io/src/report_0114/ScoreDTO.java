package report_0114;

import java.io.Serializable;

/* 1인분에 대한 성적 정보 */
public class ScoreDTO implements Serializable, Comparable<ScoreDTO>{
	private String hak; //학번
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public ScoreDTO(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
	}

	public String getHak() {
		return hak;
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
		tot = kor + eng + math;
		return tot;
	}

	public double getAvg() {
		avg = (double)tot/3;
		return avg;
	}
	
	@Override
	public int compareTo(ScoreDTO dto) {
		if(avg < dto.avg) return 1;
		else if(avg == dto.avg) return 0;
		else return -1;	
	}
	
	@Override
	public String toString() {
		return String.format("%5s %5s %5d %5d %5d %5d %5f", 
				hak, name, kor, eng, math, tot, avg);

	}
	

}
