package for_while_dowhile;

public class ForTest {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=10; i++) { //for(int i=1; i<=10; i++)로 하면 10번째 라인 에러
			System.out.println("hello"+i);
		}
		System.out.println(i); //
		
		for(i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		for(i='A'; i<='Z'; i++) {
			System.out.print((char)i+" ");
		}

	}

}
