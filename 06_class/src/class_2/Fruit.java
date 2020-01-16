package class_2;

public class Fruit {
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar; //모든 Fruit객체가 같이 쓰는 공유변수여야 함, 별도의 메모리에 생성
	
	public Fruit(){
		
	}
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
		
	public void calcTot() {
		tot = jan + feb + mar;	
	}
	
	public void display() {
		System.out.println(pum + "\t" + jan +"\t"+ feb +"\t"+ mar +"\t"+ tot);
	}
	
	public static void output() {
		System.out.println("\t" + sumJan +"\t"+ sumFeb +"\t"+ sumMar);
		
	}
	
	

}
