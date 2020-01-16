package constructor;

//클래스는  1인분단위로 만들어야함
//데이터는 DTO단위로 움직임

public class SalaryDTO {
	private String name, position;
	private int basePay, benefit, tax, salary;
	private double taxRate;
	
	public SalaryDTO(String name, String position, int basePay, int benefit) {
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
	}
	public void calc() {
		int total = basePay + benefit;
		if(total<=2000000)
			taxRate = 0.01;
		else if(total<=4000000)
			taxRate = 0.02;
		else if(total>4000000)
			taxRate = 0.03;
		tax = (int)((basePay+benefit)*taxRate);//(int)(total * taxRate);
		salary = total - tax;//basePay+benefit-tax;
		
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public int getBasePay() {
		return basePay;
	}
	public int getBenefit() {
		return benefit;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public int getTax() {
		return tax;
	}
	public int getSalary() {
		return salary;
	}
}
