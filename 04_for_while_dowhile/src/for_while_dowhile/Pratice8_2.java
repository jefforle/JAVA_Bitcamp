package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pratice8_2 {
	//static int balance=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int balance=0;
		//balance�� �����͸� ����, ������ ���� �� �����������
		//�迭: �ּҰ��� ������, ������ ���� �Ŀ��� �����ʿ� X
		
		Pratice8 pt = new Pratice8();
		
		while(true) {
			System.out.println("****************");
			System.out.println("     1. ����         ");
			System.out.println("     2. ���         ");
			System.out.println("     3. �ܰ�         ");
			System.out.println("     4. ����         ");
			System.out.println("****************");
			System.out.print("��ȣ ���� : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 4) break;
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
	private int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ݾ� : ");
		int in_value = Integer.parseInt(br.readLine());
		
		if(in_value % 10000 != 0)
			System.out.println("���� ������ �Է��ϼ���");
		else
			balance += in_value;
		return balance;
	}
	private int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("��ݾ� : ");
		int out_value = Integer.parseInt(br.readLine());	
		
		if(balance < out_value) {
			System.out.println("�ܾ��� �����մϴ�");		
		}
		else {
			balance -= out_value;
			System.out.println("����� �ܾ��� "+balance+"�� �Դϴ�");
		}
			
		return balance;
	}

}
