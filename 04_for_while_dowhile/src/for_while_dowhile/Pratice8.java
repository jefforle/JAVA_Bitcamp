package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����8] ���°��� ���α׷�
����, ���, �ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��Ͻÿ�.
����) ������ input(), ����� output()���� ó���ϼ���

[������]
****************
   1. ����
   2. ���
   3. �ܰ�
   4. ����
****************
��ȣ ���� : 1
���ݾ� : 10000
����� �ܾ��� 10000�� �Դϴ�
�Ǵ�
���ݾ� : 12000
���� ������ �Է��ϼ���

****************
   1. ����
   2. ���
   3. �ܰ�
   4. ����
****************
��ȣ ���� : 2
��ݾ� : 8000
����� �ܾ��� 2000�� �Դϴ�
�Ǵ� 
��ݾ� : 18000
�ܾ��� �����մϴ�

1. ���� 2. ��� 3. �ܰ� 4. ����
��ȣ ���� : 3
����� �ܾ��� 2000�� �Դϴ�

1. ���� 2. ��� 3. �ܰ� 4. ����
��ȣ ���� : 4
���α׷��� �����մϴ�.
 */
public class Pratice8 {
	static int balance=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Pratice8 pt = new Pratice8();
		
		for(;;) {
			System.out.println("****************");
			System.out.println("     1. ����         ");
			System.out.println("     2. ���         ");
			System.out.println("     3. �ܰ�         ");
			System.out.println("     4. ����         ");
			System.out.println("****************");
					
		
			System.out.print("��ȣ ���� : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 1) {
				balance = pt.input(balance);
				System.out.println(balance);
			} else if(num==2) {
				balance = pt.output(balance);	
			} else if(num==3) 
				System.out.print("�ܰ� : "+balance+"\n");			 
			if(num == 4) break;
			System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�");

		}
		System.out.print("����");
		

	}
	public int input(int balance) throws IOException {  //����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("���ݾ� : ");
		int in_value = Integer.parseInt(br.readLine());
		
		if(in_value % 10000 != 0)
			System.out.println("���� ������ �Է��ϼ���");
	
		return balance + in_value;
	}
	
	public int output(int balance) throws IOException {  //���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("��ݾ� : ");
		int out_value = Integer.parseInt(br.readLine());		
		
		if(balance < out_value) {
			System.out.println("�ܾ��� �����մϴ�");
			
		}
		if(out_value % 10000 != 0) {
			System.out.println("���� ������ �Է��ϼ���");
			
			
		}
		return balance - out_value;
	}
}
