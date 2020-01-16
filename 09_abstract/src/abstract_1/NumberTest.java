package abstract_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {
	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		//3자리마다 ,찍고 소수이하 3째자리
		System.out.println(nf.format(12345678.456789));
		System.out.println(12345678);
		System.out.println();
		
		//유효숫자가 아닌것은 표시하지 X
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		//소수점이 없어도 강제로 0 표시
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance(); //메소드를 이용한 생성(new대신)
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); //원화표시
		nf4.setMaximumFractionDigits(2);
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //$표시
		nf5.setMaximumFractionDigits(2);
		nf5.setMaximumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}

}
