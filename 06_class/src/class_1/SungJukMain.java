package class_1;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		//aa.name = "홍길동"; -->private이라 접근불가
		aa.setName("홍길동");
		aa.setKor(100);
		aa.setEng(81);
		aa.setMath(80);
		aa.calc();
		System.out.println(aa.getName() +"\t"+ aa.getKor()+"\t"+aa.getEng()+"\t"+aa.getMath()+"\t"
			            	+aa.getTot() +"\t"+ String.format("%.2f", aa.getAvg())+"\t"+aa.getgrade());
		
		SungJuk bb = new SungJuk();
		
		bb.setName("둘리");
		bb.setKor(80);
		bb.setEng(50);
		bb.setMath(100);
		bb.calc();
		System.out.println(bb.getName() +"\t"+ bb.getKor()+"\t"+bb.getEng()+"\t"+bb.getMath()+"\t"
			            	+bb.getTot() +"\t"+ String.format("%.2f", bb.getAvg())+"\t"+bb.getgrade());

	}

}
