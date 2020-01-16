package instance;

public class Operator {
	public static void main(String[] args) {
		
		int a = 5;
		int b = a++;
		
		System.out.println("a="+ a +"\t b=" + b);
		
		int c = ++a - b--;
		System.out.println("a="+ a +"\t b=" + b + "\t C=" + c);
	}

}
