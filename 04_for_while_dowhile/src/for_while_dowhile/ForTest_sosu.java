package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �Ҽ� - 1�� �ڱ��ڽ��� ��
 * �Ҽ� ���ϱ�
 * ��, 0�� �ԷµǸ� ���α׷� ����
 * 
 * [������]
 * �����Է� : 12
 * 12�� �Ҽ��� �ƴϴ�
 * 
 * �����Է� : 13
 * 13�� �Ҽ��̴�
 * 
 * �����Է� : 0
 * ���α׷� ����
 * 
 */

public class ForTest_sosu {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(;;) {
			int sw=0;
			System.out.println("�����Է� : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) break;
			
			for(int i=2; i<num; i++) {
				if(i%num == 0) sw=1;
			}
			if(sw==1)
				System.out.println(num+"�� �Ҽ�");
			else
				System.out.println(num+"�� �Ҽ�X");
		
		}

	}

}
