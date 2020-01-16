package report_0102_tech;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class Money {	
	int money, currency;
	double result;

	public abstract void calcMoney();
	public abstract String getMoney();
	
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
	public String getMoney() {
		NumberFormat k_numberFormat = NumberFormat.getCurrencyInstance();
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		
		return numberFormat.format(result);
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
	public String getMoney() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		
		return numberFormat.format(result);
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
	public String getMoney() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		
		return numberFormat.format(result);
	}
}

