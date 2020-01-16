package interface_1;

//interface:다중상속을 해결하려는 목적

public class InterMain implements InterC{ 
//interface를 implements 한 클래스는 반드시 추상메소드를 Override(재구현)해줘야 함
//오버라이드를 안하려면 abstract클래스를 설정, 자식클래스에서 맡기면 됨
//인터페이스가 여러개 올 수 있음. 하지만 그만큼 오버라이딩을 다 해줘야 함
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aa() {}
	
	@Override
	public void bb() {}
	
	@Override
	public void cc() {}
	
	@Override
	public void dd() {}

}
