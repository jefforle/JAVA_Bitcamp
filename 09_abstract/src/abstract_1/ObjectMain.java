package abstract_1;
/* ★ 오버라이딩에서 신경써야 할건 equals, toString!
 * 
 * class Object{ 
 * 		public boolean equals(Object ob){} //참조값 비교
 * 		public String toString(){} //클래스명@16진수
 * 		public int hashCode(){} //10진수
 * }
 * class String extends Object{ //extends Object는 생략가능
 * 		public boolean equals(Object ob){} //문자열 비교
 * 		public String toString(){} //문자열
 * 		public int hashCode(){}
 * }
 */

class Test{ //extends Object 가 생략되어 있음
	public String toString() { //오버라이딩
		//return "개발부";
		return getClass()+"@개바부";
	}
}
public class ObjectMain {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("객체 test = "+test);
		System.out.println("객체 test = "+test.toString()); //클래스명@16진수
		System.out.println("객체 test = "+test.hashCode()); //16진수를 10진수로 변환
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 test = "+str);
		System.out.println("객체 test = "+str.toString()); //문자열(무한대)
		System.out.println("객체 test = "+str.hashCode()); //문자열을 10진수로 변환
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb:"+(aa==bb)); //False. 참조(주소값) 비교 
		System.out.println("aa.equals(bb):"+aa.equals(bb)); //TRUE. 문자열 비교
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd:"+(cc==dd)); //False. 참조(주소값) 비교 
		System.out.println("cc.equals(dd):"+cc.equals(dd)); //False. 참조(주소값) 비교 
		//==>※ String클래스를 제외한 나머지는 모두 참조값 비교!!!
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff:"+(ee==ff)); //False. 참조(주소값) 비교 , ee가 Object를 참조한다 할지라도 오버라이딩 되었기 때문에 자식(String)의 메소드가 처리됨
		System.out.println("ee.equals(ff):"+ee.equals(ff)); //TRUE. 문자열 비교 

	}

}
