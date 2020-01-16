package for_while_dowhile;

public class DowhileTest {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
//		int a=0;
//		do {
//			a++;
//			System.out.println(a+" ");
//			
//		}while(a<10);
		
		//A~Z까지 출력하되 1줄에 7개씩 출력
		char ch='A';
		int count=1;
		do {			
			System.out.print(ch+" ");
			ch++;
			
			if(count%7 == 0) {
				System.out.println();
			}
			count++;
		}while(ch <= 'Z');
		

	}

}
