package instance;

/*
[����5]
���� score�� ���� 2�� 3�� ��������� �ƴ����� ����Ͻÿ�

[������]
25�� 2�� 3�� ������� �ƴϴ� (score=25�϶�)
�Ǵ�
12�� 2�� 3�� ������̴� (score=12�϶�)
 */

public class Pratice5 {
	public static void main(String[] args) {
		int a = 2, b = 3;
		int score = 12;
		int gong = score%(a*b);
		
		if(gong != 0)
			System.out.println(score + "�� 2�� 3�� ������� �ƴϴ�");
		else
			System.out.println(score + "�� 2�� 3�� ������̴�");
	}

}
