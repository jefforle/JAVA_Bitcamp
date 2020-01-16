package report_0102;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class Money {	
	int money, currency;
	double result;

	public abstract void calcMoney();
	public abstract void display();
	
}

class USMoney extends Money {
	final double USD = 1159.40;
	
	public USMoney(int money) {
		this.money = money;
	}
	@Override	
	public void calcMoney() {
		result = money/USD;
	}
	@Override
	public void display() {
		NumberFormat k_numberFormat = NumberFormat.getCurrencyInstance();
		NumberFormat us_numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println(k_numberFormat.format(money)+"→"+us_numberFormat.format(result));
	}

}

class JapanMoney extends Money {
	final double JAP = 10.66;
	
	public JapanMoney(int money) {
		this.money = money;
	}
	@Override
	public void calcMoney() {
		result = money/JAP;
	}
	@Override
	public void display() {
		NumberFormat k_numberFormat = NumberFormat.getCurrencyInstance();
		NumberFormat jp_numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		
		System.out.println(k_numberFormat.format(money)+"→"+jp_numberFormat.format(result));
	}

}

class ChinaMoney extends Money {
	final double CNY = 166.55;
	
	public ChinaMoney(int money) {
		this.money = money;
	}
	@Override
	public void calcMoney() {
		result = money/CNY;
	}
	@Override
	public void display() {
		NumberFormat k_numberFormat = NumberFormat.getCurrencyInstance();
		NumberFormat ch_numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		
		System.out.println(k_numberFormat.format(money)+"→"+ch_numberFormat.format(result));
	}
}

