package class_2;

public class StringTest {

	public static void main(String[] args) {
		//literal 생성 --> literal은 똑같은 문자열을 또 생성하지 못함
		String a = "apple"; 
		String b = "apple"; //b는 a의 주소값을 가짐
		if(a==b) System.out.println("a와 b의 참조값(주소값)이 같다"); //O
		else System.out.println("a와 b의 참조값(주소값)이 다르다");
		if(a.contentEquals(b)) System.out.println("a와 b의 문자열은 같다"); //O
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		//new --> new할때마다 메모리에 생성
		//literal과 new는 잡히는 heap영역이 다를뿐 주소의 값을 가지고 있는건 똑같음
		String c = new String("apple"); 
		String d = new String("apple"); //c와는 다른 주소값을 가짐 
		if(c==d) System.out.println("c와 d의 참조값(주소값)이 같다");
		else System.out.println("c와 d의 참조값(주소값)이 다르다"); //O
		if(c.contentEquals(d)) System.out.println("c와 d의 문자열은 같다"); //O
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 "+2019+12+30;
		System.out.println("e = "+e);
		
		/*
		 * 문자열은 편집이 안되므로 메모리에 4번 생성된다
		 * JVM에 의해 삭제되며 Garbage Collector로 보낸다
		 * Garbage Collector가 실행되면 컴퓨터는 멈춘다(찰나라 못느끼는것 뿐) 
		 * "오늘 날짜는 "
		 * "오늘 날짜는 2019"
		 * "오늘 날짜는 201912"
		 * "오늘 날짜는 20191230"
		 */
		
		System.out.println("문자열 크기="+e.length()); //공백도 문자로 인식
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+" : " + e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출="+e.substring(7)); //7~끝까지
		System.out.println("부분 문자열 추출="+e.substring(7,11)); //7~11번이전 까지(7~10)
		
		System.out.println("대문자 변경="+"Hello".toUpperCase()); //HELLO
		System.out.println("소문자 변경="+"Hello".toLowerCase()); //hello
		
		System.out.println("문자열 검색="+e.indexOf("짜")); //4
		System.out.println("문자열 검색="+e.indexOf("날짜")); //3
		System.out.println("문자열 검색="+e.indexOf("개발부")); //-1 : 없을 경우

	}

}
