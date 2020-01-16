package report_0102_tech;
/*
[문제2]
원을 입력하여 달러, 엔, 위안으로 변경하시오
계산은 calcMoney() , 출력은 dispMoney() 하도록 하시오
소수이하 둘째자리까지 표시하고 소수이하 숫자가 없으면 표시하지 않도록 하시오
통화기호도 표시하시오

클래스
Money.java
USMoney.java
JapanMoney.java
ChinaMoney.java

MoneyMain.java

[실행결과]
현금 입력 : 500000
1. 달러   2. 엔화   3. 위안  : 1
￦500,000  →  $431.78

 */

import java.text.NumberFormat;
import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int won, currency;
		Money money=null; //만능리모컨(부모클래스)
		
		System.out.print("현금 입력:");
		won = sc.nextInt(); 
		
		System.out.print("1.달러   2.엔화   3.위안 : ");
		currency = sc.nextInt();
		if(currency ==1) {
			money = new USMoney(won);
//			Money us_money = new USMoney(money); //상속개념 안쓰면 이렇게 클래스별로 new해줘야 함
//			us_money.calcMoney();
//			us_money.display();
		}
		else if(currency == 2){
			money = new JapanMoney(won);
		}
		else if(currency == 3){
			money = new ChinaMoney(won);
		}
		money.calcMoney();
		money.getMoney();
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println(numberFormat.format(won)+"->"+money.getMoney());
		
	}

}
