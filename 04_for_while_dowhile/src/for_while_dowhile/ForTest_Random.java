package for_while_dowhile;

//A~Z �������� 100���� ���
//1�ٴ� 10����

public class ForTest_Random {

	public static void main(String[] args) {
		int ch;
		int count=0;
		
		for(int i=1; i<=100; i++) {
			
			
			ch = (int)(Math.random()*26+65); //65~90
			System.out.print((char) ch + " ");
			
			if(i%10 ==0) //�������� 10���� ��� ���
				System.out.println();
			
			if(ch =='A') //������ �� A�� ����
				++count;				
		}
		System.out.println("A�� ����"+count);

	}

}
