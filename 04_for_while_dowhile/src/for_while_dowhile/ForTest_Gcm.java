package for_while_dowhile;

/*
 * 1~500������ ������ 100�� �߻��Ͽ� 2�� 3�� ������� ����ϰ� �հ� ���� ���
 * ��, 1�ٿ� 7���� ���
 * 
 * [������]
 * 36, 12 ...
 * 
 * 2�� 3�� ����� ���� = 
 * 2�� 3�� ����� �� =
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
				if(count%7 == 0) System.out.println(); //���� 7���� ���
			}

		}System.out.println();
		System.out.println("2�� 3�� ����� ���� =" + count);
		System.out.println("2�� 3�� ����� �� =" + hap);
	}

}
