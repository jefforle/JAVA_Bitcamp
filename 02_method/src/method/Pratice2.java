package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 [����2]
�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
���� add()���� ���Ͽ� ���� �޴´�

[������]
ù��° �ֻ��� �� : 3
�ι�° �ֻ��� �� : 6
���� 9 �̴�
 */

public class Pratice2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int num1 = (int)Math.random();
		//int num2 = (int)Math.random();
		Pratice2 pp = new Pratice2();
		
		int result = pp.add((int)Math.random(), (int)Math.random());
		
		System.out.println(result);

	}

	
	public int add (int num1, int num2) {
		return num1 + num2;	
	}

}
