package method;

public class Boxing {

	public static void main(String[] args) {
		int a=25;
		double b = (double)a/3; //�Ͻ��� ����ȯ
		
		String a = "25";
		int b = (int)a;
		
		int c = 5;
		Integer d = c; //AutoBoxing �⺻�� -> ��ü�� (�ڵ�����ȯ, ��ü�� ����ڴ�!)
		//Integer d = new Integer(c); //JDK 1.5 ����
		
		Integer e = 5;
		int f = e; //unAutoBoxing ��ü�� -> �⺻�� (�ڵ�����ȯ, �⺻������ �ݵ�ڴ�!)
		//int f = e.intValue(); //JDK 1.5 ����

	}

}
