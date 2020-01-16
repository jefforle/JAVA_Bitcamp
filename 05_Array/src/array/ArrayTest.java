package array;

public class ArrayTest {
	//필드 (선언문만 올 수 있음)
//	int a = 3;
//	int a;
//	a = 3; 
	
	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[0]=25;
		ar[1]=36;
		ar[2]=47;
		ar[3]=55;
		ar[4]=66;
		
		System.out.println("배열명  ar=" +ar); //ar = 배열명 = ar의 주소
		System.out.println("배열명  ar=" +ar.toString()); //java가 제공하는 메소드. 객체를 문자로 표현하는 메소드
		System.out.println("배열크기  ar=" +ar.length); //java가 제공하는 메소드.
		for(int i=0; i<ar.length; i++)  //i<=ar.length으로 쓰지않도록 주의!
			System.out.println("ar["+i+"]="+ar[i]); //
		
		System.out.println("거꾸로 출력");
		for(int i=ar.length-1; i>=0; i--)
			System.out.println("ar["+i+"]="+ar[i]);
		
		System.out.println("홀수만 출력");
		for(int i=0; i<ar.length; i++)
			if(ar[i]%2 != 0)
				System.out.println("ar["+i+"]="+ar[i]);
		
		System.out.println("확장 for");
		for(int data : ar) { //ar의 크기만큼 반복하면서 데이터 꺼내줌(배열 방번호 개념이 X, 방번호에 따라 데이터 추출 X)
			 				 //방을 가르키는게 아니라 방안의 데이터를 가르킴
			System.out.println(data);
		}

	}

}
