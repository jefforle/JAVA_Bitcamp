package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 이름(name)과 주민번호(id)를 입력하여 성별을 출력하시오
 * 성별(gender)을 구별하는 comp()메소드와 나이(age)를 계산하는 calcAge()메소드를 작성하시오
 * 
 * 이름 입력 : 홍길동
 * 주민번호 읿력 : 951020-123456   //주민번호는 문자열로 잡아야함. 
 *  
 * 홍길동님은 남자이고 20살입니다. 
 */

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodTest4 mt = new MethodTest4();
		System.out.println("이름 입력 : ");
		String name = br.readLine();
		System.out.println("주민번호 입력 : ");
		String id = br.readLine();
		String gender = mt.comp(id);
		
		int age = mt.calcAge(id);  //
	
		System.out.println(name+"님은 "+gender+"이고 "+age+"살입니다.");
	
	}
	public String comp(String id) {
		//if(Integer.parseInt(id.charAt(7)+"") == 1 || Integer.parseInt(id.charAt(7)+"") == 3)
		//	return "남자";			
		return (Integer.parseInt(id.charAt(7)+"") == 1 || Integer.parseInt(id.charAt(7)+"") == 3) ? "남자" : "여자";
	}
	public int calcAge(String id) {//8번째 자리가 1,2면 1900년대 생 3,4면 2000년대생 
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
