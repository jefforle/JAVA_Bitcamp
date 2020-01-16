package class_1;

//식당의 메뉴판, 객체에서 여러번 가져다가 쓸 수 있음
class Person{
	private String name; //캡술화, 필드(전역변수)는 초기화시킬 필요 없음 //지역변수는 초기화 필요
	private int age;
	
	public void setName(String n) { //set : 데이터를 받는다. (이름name 데이터 받는 함수)
		name = n;
	}
	public void setAge(int n) { //set : 데이터를 받는다. (나이age 데이터 받는 함수)
		age = n;
	}
	public void setData(String n, int m) {
		name = n;
		age = m;
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

public class PersonMain {

	public static void main(String[] args) {
		
		Person aa; //객체(주소값을 가지고 있음)
		aa = new Person();
		
		//호출
		//aa.name = "홍길동";	  --> private이라 접근할 수 X
		//aa.age = 25;		  --> private이라 접근할 수 X
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름:"+ aa.getName() +"\t 나이"+ aa.getAge());
		
		Person bb = new Person(); //새로운 객체 생성
		bb.setName("코난");
		bb.setAge(10);
		System.out.println("이름:"+ bb.getName() +"\t 나이"+ bb.getAge());
		
		Person cc = new Person();
		cc.setData("또치", 30);
		System.out.println("이름:"+ cc.getName() +"\t 나이"+ cc.getAge());
		
		Person dd = new Person();
		dd.setData();
		System.out.println("이름:"+ dd.getName() +"\t 나이"+ dd.getAge());

	}

}
