package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����1]
����(dec)�� �Է¹޾Ƽ� 2����(binary), 8����(octor), 16����(hexa) ��ȯ�Ͻÿ�
IntegerŬ���� �޼ҵ带 �̿��Ͻÿ�

[������]
10������ �Է��ϼ��� : 250

2���� = 11111010
8���� = 372
16���� = fa
 */

public class Pratice1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10���� �Է� : ");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);
		String octor = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.print(binary +"\t"+ octor +"\t"+ hexa);
		

	}

}
