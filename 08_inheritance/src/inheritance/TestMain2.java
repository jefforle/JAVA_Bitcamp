package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.println("AA:"+a+" ");
	}
}

class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB:"+a+" ");
	}
}

public class TestMain2 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.disp();
		System.out.println(bb.a);
		System.out.println();
		
		AA aa = new BB(); //부모=자식, 부모는 자식을 참조할 수 있다
		aa.disp(); //BB:13 --> AA클래스를 참조해도 Override되어 자식이 우선권을 가짐, 자식
		System.out.println(aa.a); //변수는 오버로드, 오버라이드가 없음
		System.out.println();
		
		BB bb2 = (BB)aa; //자식=(자식)부모
		System.out.println(bb2.a);

	}

}
