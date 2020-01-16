package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ڡڡ� ���ڸ��߱� ���ӡڡڡ�
 * 1~100������ ������ �߻��Ͽ� ���ߴ� ����
 * ������: com, user
 */

public class NumberGame { 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do { // ���ҷ�(Y/N)? ==> �ݺ��Ǵ� ������ �߿� "����~��"������ �ݺ�
			int com = (int) (Math.random() * 100) + 1; // 1~100������ ����
			System.out.println(com);
			int count = 0; //count�� ���� �����Ҷ����� �ʱ�ȭ����� ��

			while (true) {
				count++;
				System.out.println("�����Է� : ");
				int user = Integer.parseInt(br.readLine());

				if (user > com)
					System.out.println(user + "���� �۽��ϴ�.");
				else
					System.out.println(user + "���� Ů�ϴ�.");

				if (user == com)
					break; // �������϶� while�� �����!
			}
			System.out.println(count + "������ ���߼̽��ϴ�!");

			System.out.println("���ҷ�(Y/N)?");
			String again = br.readLine();
			if (again.equals("N") || again.equals("n"))
				break; // do~while �����!

		} while (true);

	}

}
