package class_1;
/*
[문제2]
area(3) 를 호출하여 원의 넓이
area(5,7)를 호출하여 삼각형 넓이
area(2,3,5)를 호출하여 사다리꼴 넓이를 구하시오

클래스명 : ShapeTest
필드 : PI (3.141592)

[실행결과]
원의 넓이 : 28.274337
삼각형의 넓이 : 20.0
사다리꼴의 넓이 : 24.5
 */
class ShapeTest { //--> public class ShapeTest{}
	public static final double PI = 3.141592; //final:변하지 않는 값 지정(상수화), 데이터값 못바꿈
	//static은 new할 필요 X
	
	public double area(int x) {
		return x*x*PI;
	}
	public double area(int x, int y) {
		return  x*y/2.0;	
	}
	public double area(int x, int y, int z) {
		return (x+y)*z/2.0;
	}

}

public class Pratice2 {

	public static void main(String[] args) {
		
		System.out.println("PI="+ShapeTest.PI);
		ShapeTest st = new ShapeTest();
		
		System.out.println("원의 넓이 : "+st.area(3));
		System.out.println("삼각형의 넓이 : "+st.area(5,7));
		System.out.println("사다리꼴의 넓이 : "+st.area(2,3,5));
	}

}

//==> 하나의 java파일에 class가 1개이상일때 : 주인클래스는? 1.Main()을 가지고 있는 class OR 2. public을 가지고 있는 class(ex.public class Pratice2)