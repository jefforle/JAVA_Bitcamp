package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���ڸ� �Է��Ͽ� ����� 7���� ���϶�
 * �� �����̸� �ٽ� �Է��ϰ� 0�̸� ����
 * 
 * [������]
 * �����Է� : -7
 * �����Է� : 8
 * 8 16 24 32 40 48 56
 * 	power *= x;	
 * 8 = 8*1		
 * 16 = 8*2		
 * 24 = 8*3		
 * ...
 * 
 * ���� �Է� : 0
 * ���α׷� ����
 */

public class Multiple {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) { //0�� �Էµɶ����� �ݺ�
			
			System.out.println("�����Է� : ");
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) break; //0�̸� ���α׷� ����
			if(num<0) continue; //������ ���� ���Է�(while�� ó������ �ǵ��ư�)
			
			for(int i=1; i<=7;i++) {
				System.out.print(num*i+" ");
			}
			System.out.println();
		}System.out.println("���α׷� ����"); //�ݺ��� ������ ���α׷� ����
		

	}

}
