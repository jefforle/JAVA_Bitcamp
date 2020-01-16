package for_while_dowhile;

public class MultiFor {

	public static void main(String[] args) {
		// 2단~9단


//		for (dan = 2; dan <= 9; dan++) { //다중 for문은 자주 변하는 수가 안쪽!!
//			for (i = 1; i <= 9; i++) {
//				System.out.println(dan + "*" + i + "=" + (dan * i));
//			}
//			System.out.println();
//		}
		
		for (int i=1; i<=9; i++) { //다중 for문은 자주 변하는 수가 안쪽!!고정되는 수는 바깥쪽!!
			for (int dan=2; dan<=9; dan++) {
				System.out.print(dan+"*"+i+"="+(dan*i)+"\t");
			}
		System.out.println();
		}	
	}
}
