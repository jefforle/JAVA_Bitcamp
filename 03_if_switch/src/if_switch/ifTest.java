package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifTest {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a = Integer.parseInt(br.readLine());
		if(a>=50) System.out.println(a+"�� 50���� ũ�ų� ����");
		System.out.println(a+"�� 50���� �۴�");
		
		if(false) 
			if(true) System.out.println("A");
			else System.out.println("B");
		
		System.out.println("C");
		System.out.println();
		
		if (a%2 != 0) System.out.println(a+"�� Ȧ��");
		else System.out.println(a+"�� ¦��");
	
		
		if(a>='A' && a<='Z') //65 ~ 90
			System.out.println((char)a+"�� �빮��");
		else if(a>='a' && a<='z')
			System.out.println((char)a +"�� �ҹ���");
		else
			System.out.println(a+"�� �����̰ų� Ư������");

	}

}
