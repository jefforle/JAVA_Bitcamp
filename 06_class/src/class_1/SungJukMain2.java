package class_1;
//클래스는 그룹. 
public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3]; //타입이 클래스타입인 객체배열 생성
		ar[0] = new SungJuk(); //
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setName("홍길동");
		ar[0].setKor(100);
		ar[0].setEng(81);
		ar[0].setMath(80);
		
		ar[1].setName("둘리");
		ar[1].setKor(80);
		ar[1].setEng(50);
		ar[1].setMath(100);
		
		for(SungJuk data : ar) {
			data.calc();
			System.out.println(data.getName() +"\t"+ data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"
	            	+data.getTot() +"\t"+ String.format("%.2f", data.getAvg())+"\t"+data.getgrade());
		}
		
		


	}

}
