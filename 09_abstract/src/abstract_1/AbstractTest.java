package abstract_1;

public abstract class AbstractTest { //POJO(Plain Old Java Object)
	
	String name; //default 접근제어자
	
	public abstract void setName(String name); //추상 메소드 : 아직 안만들어진 것, setName()이 생길거라고 예고해주는 것, 만들어질지 안만들어질지 몰라요
	//추상클래스는 반드시 abstract 키워드 필요
	//추상메소드가 존재하는 클래스는 반드시 추상 클래스여야 한다! (추상클래스는 추상메소드가 없어도 된다)
	//추상클래스는 new(메모리생성) 할 수 없다.
	
	public String getName() {
		return name;
	}

}
