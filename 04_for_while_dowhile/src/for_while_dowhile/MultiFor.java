package for_while_dowhile;

public class MultiFor {

	public static void main(String[] args) {
		// 2��~9��


//		for (dan = 2; dan <= 9; dan++) { //���� for���� ���� ���ϴ� ���� ����!!
//			for (i = 1; i <= 9; i++) {
//				System.out.println(dan + "*" + i + "=" + (dan * i));
//			}
//			System.out.println();
//		}
		
		for (int i=1; i<=9; i++) { //���� for���� ���� ���ϴ� ���� ����!!�����Ǵ� ���� �ٱ���!!
			for (int dan=2; dan<=9; dan++) {
				System.out.print(dan+"*"+i+"="+(dan*i)+"\t");
			}
		System.out.println();
		}	
	}
}
