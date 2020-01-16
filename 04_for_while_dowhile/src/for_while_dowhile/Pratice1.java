package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����1] ���������� ���� - if��

[������]
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Win!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Lose!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 2 (user)
��ǻ�� : ����	�� : ����
You Draw!!
�� �ҷ�(Y/N) : n
���α׷��� �����մϴ�
 */

public class Pratice1 {

	public static void main(String[] args) throws IOException {
		// for( ; ; ) OR while(true) //���ѷ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int user = Integer.parseInt(br.readLine());
		int com = (int) (Math.random() * 3) + 1;
		String again = br.readLine(); //�ݺ����� ���� ����

		for( ; ; ) {
			if (com == 1) {// ��ǻ�Ͱ� �����϶�
				if (user == 1) {
					System.out.println("��ǻ��:����	��:����");
					System.out.println("You Draw!");
				} else if (user == 2) {
					System.out.println("��ǻ��:����	��:����");
					System.out.println("You Win!");
				} else {
					System.out.println("��ǻ��:����	��:���ڱ�");
					System.out.println("You Lose!");
				}
			}
			if (com == 2) {// ��ǻ�Ͱ� �����϶�
				if (user == 1) {
					System.out.println("��ǻ��:����	��:����");
					System.out.println("You Lose!");
				} else if (user == 2) {
					System.out.println("��ǻ��:����	��:����");
					System.out.println("You Draw!");
				} else {
					System.out.println("��ǻ��:����	��:���ڱ�");
					System.out.println("You Win!");
				}
			}
			if (com == 3) {// ��ǻ�Ͱ� ���϶�
				if (user == 1) {
					System.out.println("��ǻ��:���ڱ�	��:����");
					System.out.println("You Win!");
				} else if (user == 2) {
					System.out.println("��ǻ��:����	��:����");
					System.out.println("You Draw!");
				} else {
					System.out.println("��ǻ��:���ڱ�	��:����");
					System.out.println("You Lose!");
				}
			}
			
			System.out.println("���ҷ�(Y/N)?");
//			String again = br.readLine();  //�ݺ����� ���� ����(����ᵵ �ǰ�, �����Ἥ �������� ��Ƶֵ� �ǰ�)
			if (again.equals("N") || again.equals("n")) 
				break; // for �����!
			
		} 
		System.out.println("����");

	}

}
