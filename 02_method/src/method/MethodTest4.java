package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �̸�(name)�� �ֹι�ȣ(id)�� �Է��Ͽ� ������ ����Ͻÿ�
 * ����(gender)�� �����ϴ� comp()�޼ҵ�� ����(age)�� ����ϴ� calcAge()�޼ҵ带 �ۼ��Ͻÿ�
 * 
 * �̸� �Է� : ȫ�浿
 * �ֹι�ȣ �߷� : 951020-123456   //�ֹι�ȣ�� ���ڿ��� ��ƾ���. 
 *  
 * ȫ�浿���� �����̰� 20���Դϴ�. 
 */

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodTest4 mt = new MethodTest4();
		System.out.println("�̸� �Է� : ");
		String name = br.readLine();
		System.out.println("�ֹι�ȣ �Է� : ");
		String id = br.readLine();
		String gender = mt.comp(id);
		
		int age = mt.calcAge(id);  //
	
		System.out.println(name+"���� "+gender+"�̰� "+age+"���Դϴ�.");
	
	}
	public String comp(String id) {
		//if(Integer.parseInt(id.charAt(7)+"") == 1 || Integer.parseInt(id.charAt(7)+"") == 3)
		//	return "����";			
		return (Integer.parseInt(id.charAt(7)+"") == 1 || Integer.parseInt(id.charAt(7)+"") == 3) ? "����" : "����";
	}
	public int calcAge(String id) {//8��° �ڸ��� 1,2�� 1900��� �� 3,4�� 2000���� 
		int year = Integer.parseInt(id.substring(0,2));
		char g = id.charAt(7);
		year += (g=='1' ||g=='2' ? 1900 : 2000);
		int age = 2019 - year +1;
		
		return age;
		/*
		if (id.charAt(7)=='1' || id.charAt(7)=='2') 
			return 2019-(1900 + Integer.parseInt(id.substring(0,2))) + 1;
		else 
			return 2019 - Integer.parseInt(id.substring(0,2)) + 1;
		*/
	}


}
