/* 1/7(화) 1 */
package collection;

public class GenericTest<T> {
	private T a;
	
	public void setA(T a){ //받는거
		this.a = a;
	}
	public T getA(){ //내보내는거
		return a;
	}
	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>(); //T가 String 타입으로 규정됨
		aa.setA("홍길동");
		//aa.setA(25); --ERROR, 타입을 String으로 지정해놔서
		System.out.println("이름:"+aa.getA());
		
		GenericTest<Integer> bb = new GenericTest<Integer>();
		//생긴 클래스는 똑같고 정해진 규정으로만 사용하겠다. -> 캐스팅 안해도 됨
		bb.setA(25);
		System.out.println("나이"+bb.getA());
	}

}
