package instance;

/*
[����2] �ﰢ�����̸� ����Ͻÿ� (base, height, area)
�ﰢ������ = (�غ� * ����)/2

[������]
**** �ﰢ���� ���� ���ϱ�  ****
�غ� :  10  
���� :   3
���� :   XX.XX  	<--- �Ҽ� 2�ڸ���������Ͻÿ�
 */

public class Pratice2 {

	public static void main(String[] args) {
		int base=15, height=3;
		double area = ((double)base * height) / 2;
		
		System.out.println("�غ� : " + base);
		System.out.println("���� : " + height);
		System.out.println("���� : " + String.format("%.2f", area));
		

	}

}
