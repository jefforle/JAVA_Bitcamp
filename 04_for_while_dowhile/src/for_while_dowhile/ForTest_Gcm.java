package for_while_dowhile;

/*
 * 1~500사이의 난수를 100개 발생하여 2와 3의 공배수만 출력하고 합과 개수 출력
 * 단, 1줄에 7개씩 출력
 * 
 * [실행결과]
 * 36, 12 ...
 * 
 * 2와 3의 공배수 개수 = 
 * 2와 3의 공배수 합 =
 */
public class ForTest_Gcm {

	public static void main(String[] args) {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hap = 0, count = 0;

		for (int i = 1; i <= 100; i++) {

			int num = (int) (Math.random() * 500) + 1;
			

			if (num % 2 == 0 && num % 3 == 0) {
				//System.out.print(num+"\t");
				System.out.print(String.format("%5d", num));
				hap += num;
				count++;
				if(count%7 == 0) System.out.println(); //난수 7개씩 출력
			}

		}System.out.println();
		System.out.println("2와 3의 공배수 개수 =" + count);
		System.out.println("2와 3의 공배수 합 =" + hap);
	}

}
