package instance;
/*
[����7]
�̸�(name)�� ȫ�浿, ����(gender)M�� ���� ���ڶ�� ��� M�� �ƴϸ� ���ڶ�� ����Ͻÿ�

[������]
ȫ�浿�� �����̴�
�Ǵ� 
ȫ�浿�� �����̴�
 */

public class Pratice7 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String gender = "F";
		
		if(gender == "M")
			System.out.println(name + "�� ����");
		else
			System.out.println(name + "�� ����");
		
/*		
		String re = gender == "M" ? name+"�� ����" : name+"�� ����";
		System.out.println(re);
*/
	}

}
