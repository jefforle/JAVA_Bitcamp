package instance;

/*
 * ����
 * 320, 258�� ������ �����Ͽ� ���� ���Ͻÿ�
 * 
 * [������]
 * 320 + 258 = xxx
 * 320 - 258 = xxx 
 * 320 * 258 = xxx
 * 320 / 258 = xxx
 */


public class NumberTest {

	public static void main(String[] args) {
		
		int num1 = 320;
		int num2 = 258;
		int sum, sub, mul;
		double div;
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = (double)num1 / num2;
		
		 
		System.out.println("320 + 258 = " + sum);
		System.out.println("320 - 258 = " + sub);
		System.out.println("320 * 258 = " + mul);
		System.out.println("320 / 258 = " + String.format("%.2f", div));
		
		
		
	}

}
