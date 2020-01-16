
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//키보드로 들어오는 값을 
		
		System.out.print("문자열 입력");
		String str = br.readLine(); //readLine()하면 문자열로 들어옴
		
		System.out.print("정수형 입력");
		int aa = br.readLine(); //문자열로 들어오는 것을 정수형으로 변환해라
		

		System.out.print("실수형 입력");
		double bb = br.readLine(); //문자열로 들어오는 것을 실수형으로 변환해라
		
		
		System.out.println(str + "\t" + aa + "\t" + bb);
		
		
		
		
	}

}

// InputTest