package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x, y;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x값 입력:");
		x = sc.nextInt();
		System.out.print("y값 입력:");
		y = sc.nextInt();
		System.out.println("------------------------");
	}
	public void output() {
		assert y >= 0 : "y는 0보다 크거나 같아야 한다"; //
		
		
		int result=1;
		for(int i=1; i<=y; i++)
			result *= x;
		System.out.println(x+"의 "+y+"승은 "+ result);
	}
	
	public static void main(String[] args) {
		Assert as = new Assert();
		as.input();
		as.output();

	}

}
