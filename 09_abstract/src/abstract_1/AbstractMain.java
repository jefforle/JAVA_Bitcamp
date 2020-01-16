package abstract_1;

public class AbstractMain extends AbstractTest{ 
//AbstractTest는 new로 생성할 수 없기 때문에 강제로 부모로 상속시켜서 오버라이드 하여 사용
//오버라이딩하기 싫으면 AbstractMain도 abstract하면 되는데 이러면 AbstractMain도 막힘
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args)  {
		//AbstractTest at = new AbstractTest(); --ERROR. 추상클래스는 new가 불가능! 
		AbstractTest at = new AbstractMain();
		at.setName("hong");
		System.out.println(at.getName());
			

	}

}
/*
//클래스
class 부모{
	public abstract void abc(); //많~은 자식클래스를 제어하기 위해 사용
}
부모 = new AA();
부모.abc();
부모 = new BB();
부모.abc();
부모 = new CC();
부모.abc();
부모 = new DD();
부모 = new EE();
class Dog{
	public abstract void disp(); //반드시 오버라이딩 해라
	public final void disp(); //
}
class KorDog exteds Dog{				class EngDog extends Dog{
	public void disp() {					public void disp() 
			왕왕									BowWow
	}									}
}
*/