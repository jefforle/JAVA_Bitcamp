package constructor;

public class VarArgs {
//	public int sum(int a, int b) {
//		return a+b;
//	}
//	public int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	public int sum(int a, int b, int c, int d) {
//		return a+b+d+d;
//	}
	public int sum(int... ar) {//배열로 받는다
		int tot=0;
		for(int i=0; i<ar.length; i++) {
			tot += ar[i];
		}
		return tot;
		
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("합="+va.sum(10,20)); 
		//return이 필요한 함수의 특징 : 데이터를 찍어내거나, 변수에 보관
		System.out.println("합="+va.sum(10,20,30));
		System.out.println("합="+va.sum(10,20,30,40));
	}
	

}
