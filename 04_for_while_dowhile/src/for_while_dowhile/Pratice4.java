package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����4] ���� ����
10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ����
�������� �� 5������ �����Ѵ�
1������ ���� 20���� ���
���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�

[������]
[1] 25 + 36 = 45
Ʋ�ȴ�
[1] 25 + 36 = 61
������

[2] 78 + 10 = 100
Ʋ�ȴ�
[2] 78 + 10 = 95
Ʋ�ȴ�...���� :
...

����� �� x������ ���߾ xx�� �Դϴ�

continue(y/n) : w
continue(y/n) : n
���α׷��� �����մϴ�
*/

public class Pratice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0, score = 0;

		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 90) + 10;
			int b = (int) (Math.random() * 90) + 10;

			int hap = a + b;

//			System.out.println(hap);
			for (int j = 1; j <= 2; j++) {
				System.out.print("[" + i + "]" + a + "+" + b + "= ");
				int user = Integer.parseInt(br.readLine());
				
				if(user != hap) {
					System.out.println("����");
					continue;
				}
				if (user == hap) {
					System.out.println("������");
					score += 20;
					count++;
					break;
				}
			}
		}
		System.out.println(count + "������ ���߾� " + score + "�� �Դϴ�.");
	}

}
