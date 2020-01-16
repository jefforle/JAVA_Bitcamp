/* 1/6(월) 5 */
package nested;

//Inner는 Outer에 접근가능
//Outer는 Inner에 접근가능X, 객체 생성하면 접근가능
//중첩하는 이유: private변수 접근시 setter/getter가 필요 없음
//상속관계는 아님!!
public class Outer {
	private String name;
	
	public void output() {
//		System.out.println("이름:"+name+" 나이:"+age); //ERROR. 바깥클래스는 안쪽클래스에 접근할 수 없음!
		System.out.println("이름:"+name+" 나이:"+new Inner().age); 
	}
	
	class Inner{
		private int age;
		
		public void disp() {
			System.out.println("이름:"+name+" 나이:"+age); //안쪽클래스는 바깥클래스를 접근할 수 있음!
			System.out.println("이름:"+Outer.this.name+" 나이:"+this.age); //윗줄과같은 의미 Outer.name가 안되는 이유? Outer생성하지 않아서
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer(); //상속관계가 아니기 때문에 Outer클래스만 생성! Outer클래스 생성했다고 Inner클래스도 생성되는게 아님!!
		outer.name = "홍길동";
		System.out.println("이름:"+outer.name); //내클래스기 때문에 getter가 없어도 private변수에도 접근가능
		
		Outer.Inner inner = outer.new Inner(); //Outer안에 inner클래스를 만들어야 함
		inner.age = 25;
		inner.disp();
		
		Outer.Inner inner2 = outer.new Inner(); //inner클래스는 여러개 생성될 수 있음
		inner2.age = 30;
		inner2.disp();
		
		Outer.Inner inner3 = new Outer().new Inner(); 
		//inner3.name = "코난"; //ERROR. 클래스대클래스 내부에서만 접근가능한거지 static에서는 접근 불가능
		inner3.age = 35;
		inner3.disp();

	}

}
/*클래스 파일 생성
 * Outer.java
 * Outer.class / Outer$inner.class
 */
