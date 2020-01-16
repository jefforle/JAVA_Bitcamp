/* 1/7(화) 2 */
package collection;

public class GenericTest2<T> {
	private T a;
	
	public GenericTest2(T a) {
		this.a = a;
	}
	public void setA(T a){ //받는거
		this.a = a;
	}
	public T getA(){ //내보내는거
		return a;
	}

	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("홍길동");
		//aa.setA("홍길동"); --ERROR. ?는 생성자를 통해서만 데이터를 입력받는다
		//String name = aa.getA(); --ERROR. ?는 Object로 잡아주겠다는 의미 /getA()가 Object로 받음
		String name = (String)aa.getA(); 
		System.out.println(name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int age = (Integer)bb.getA(); //unAutoBoxing
		System.out.println(age);

	}

}
