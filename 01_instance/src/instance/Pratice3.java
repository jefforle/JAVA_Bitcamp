package instance;

/*
[����3]
�̸��� L(name)�� ����� �⺻��(basePay)�� 2500000�϶� 3.3% ����(tax)�� ����(salary)�� ����Ͻÿ�. �����ʹ� �ݵ�� ������ �����ϱ�.

���� = �⺻�� * 3.3%(0.033)
���� = �⺻��-����
      
Class Name : Practice1.java

<���� ���>
*** L�� ���� ***
�⺻�� : 2500000��
����   : 82500��
����   : 2417500��
 */

public class Pratice3 {

	public static void main(String[] args) {
		int basePay = 2500000;
		double tax = basePay * 0.033;
		double salary = basePay - tax;
		
		System.out.println("***L�� ����***");
		System.out.println("�⺻�� : " + basePay);
		System.out.println("���� : " + (int)tax);
		System.out.println("���� : " + (int)salary);

	}

}
