package for_while_dowhile;

//[������]
//-1+2-3+4-5+6 ...-9+10 = 5

public class ForTest_Sum {

	public static void main(String[] args) {		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				sum += i;
				System.out.print("+"+i); 
			} else {
				sum -= i;
				System.out.print("-"+i);
			}
		}
		System.out.print("="+sum);

	}

}
