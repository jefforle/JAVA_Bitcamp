package for_while_dowhile;

//A~Z 무작위로 100개를 출력
//1줄당 10개씩

public class ForTest_Random {

	public static void main(String[] args) {
		int ch;
		int count=0;
		
		for(int i=1; i<=100; i++) {
			
			
			ch = (int)(Math.random()*26+65); //65~90
			System.out.print((char) ch + " ");
			
			if(i%10 ==0) //랜덤값을 10개씩 끊어서 출력
				System.out.println();
			
			if(ch =='A') //랜덤값 중 A의 갯수
				++count;				
		}
		System.out.println("A의 갯수"+count);

	}

}
