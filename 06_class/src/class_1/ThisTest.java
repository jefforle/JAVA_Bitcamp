package class_1;

class This{
	private String name;
	private int age;
	
	public void setName(String name) { //set : 데이터를 받는다. (이름name 데이터 받는 함수)
		this.name = name;
	}
	public void setAge(int age) { //set : 데이터를 받는다. (나이age 데이터 받는 함수)
		this.age = age;
	}
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setData() { //들어오는 것도 없고 할일도 없는 메소드
		
	}
	public String getName() { //get : 데이터를 꺼낸다. 
		return name;
	}
	public int getAge() {
		return age;
	}
	
}

public class ThisTest {
	//private String name; //내 클래스안에 있는 변수들이라 getter/setter 필요X
	//private int age;

	public static void main(String[] args) {
		
		This aa = new This();
		//aa.name = "홍길동";
		aa.setName("홍길동");
		aa.setAge(25);	
		System.out.println("이름:"+ aa.getName() +"\t 나이"+ aa.getAge());

		Person bb = new Person(); //새로운 객체 생성
		bb.setName("코난");
		bb.setAge(10);
		System.out.println("이름:"+ bb.getName() +"\t 나이"+ bb.getAge());
		
	}

}
