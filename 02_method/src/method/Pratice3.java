package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����3]
�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�
 */

public class Pratice3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Pratice3 p3 = new Pratice3();
		System.out.print("�� �Է� : ");
		int sec = Integer.parseInt(br.readLine());
		
		p3.time(sec);
		
	}
	public int time(sec) {
		int hour = second / 3600;  //1�ð� = 3600��
		int minute = second % 3600 / 60; //1�� = 60��
		int second = second % 3600 % 60;

		System.out.println(hour+"�ð�"+minute+"��"+second+"��");
		
	}

}
