package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;

	public void input() throws IOException{ //구현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력:");
		dan = Integer.parseInt(br.readLine());
	}
	public void output() {
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++){
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}else {
			//System.out.println("범위초과(2~9단까지만 가능)");
			
			//에러가 발생하는 구역이 아닌데, 개발자가 강제로 Exception발생
			try {
				//throw new Exception("범위초과(2~9단까지만 가능)");	 //throw는 try안에만 사용, exception발생하는 구역이기 떄문에
				throw new MakeException("범위초과(2~9단까지만 가능)"); 
			}catch(Exception e) {
				e.printStackTrace(); //에러메세지를 찍어라
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		ExceptionTest2 exception = new ExceptionTest2();
		exception.input(); //메소드 구현부에 IOException이 걸리면, 호출부에서도 IOException이 같이 걸려야 함!
		exception.output();
	}

}
