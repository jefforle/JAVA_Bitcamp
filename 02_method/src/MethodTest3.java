
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Ű����� ������ ���� 
		
		System.out.print("���ڿ� �Է�");
		String str = br.readLine(); //readLine()�ϸ� ���ڿ��� ����
		
		System.out.print("������ �Է�");
		int aa = br.readLine(); //���ڿ��� ������ ���� ���������� ��ȯ�ض�
		

		System.out.print("�Ǽ��� �Է�");
		double bb = br.readLine(); //���ڿ��� ������ ���� �Ǽ������� ��ȯ�ض�
		
		
		System.out.println(str + "\t" + aa + "\t" + bb);
		
		
		
		
	}

}

// InputTest