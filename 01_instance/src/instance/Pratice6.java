package instance;

/*
[문제6]
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오

[실행결과]
T → t (ch에 T에 있을 때)
또는
e → E (ch에 e가 있을 때)
 */
//A = 65
//a = 97
public class Pratice6 {

	public static void main(String[] args) {
		char c = 'a';
		
		if(c >= 65 && c <= 96)
			System.out.println((char)(c+32));
		else
			System.out.println((char)(c-32));
		
	
	}

}
