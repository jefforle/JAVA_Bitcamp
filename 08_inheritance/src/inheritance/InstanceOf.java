package inheritance;

class AAA{}
class BBB extends AAA{}

public class InstanceOf {

	public static void main(String[] args) {
		AAA aa = new AAA();
		//AAA bb = aa;
		BBB bb = new BBB();
		AAA aa2 = new BBB();
		
		AAA aa3 = aa;
		if(aa instanceof AAA)  //aa값이 AA타입으로 캐스팅 될수있나? aa를 따라가면 AA클래스가 나오나
			System.out.println("1.TRUE");	
		else
			System.out.println("1.FALSE");
		
		AAA aa4 = bb; //부모=자식
		if(bb instanceof AAA) 
			System.out.println("2.TRUE");	
		else
			System.out.println("2.FALSE");
		
		BBB bb2 = (BBB)aa; //ERROR. 자식 = (자식)부모, 아래BBB클래스가 없음	
		//캐스팅이 안됨, 부모는 어떤자식이 있는지 모름,
		if(aa instanceof BBB) 
			System.out.println("3.TRUE");	
		else
			System.out.println("3.FALSE");
		
		BBB bb3 = (BBB)aa2;
		if(aa2 instanceof BBB) 
			System.out.println("4.TRUE");	
		else
			System.out.println("4.FALSE");

	}

}
