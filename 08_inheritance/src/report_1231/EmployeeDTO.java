package report_1231;

public class EmployeeDTO {
	private String name, position;
	private int basePay, benefit, tax, salary;
	private double taxRate;
	
	public void setName(String name){
		this.name = name;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public void setBasePay(int basePay){
		this.basePay = basePay;
	}
	public void setBenefit(int benefit){
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
		tax = (int)(total*taxRate);//(int)(basePay + benefit * taxRate);
		salary = total - tax;//basePay+benefit-tax;
	}
	
	public String getName() {
		return name;
	}
	public String getPosision() {
		return position;
	}
	public int getBasePay() {
		return basePay;
	}
	public int getBenefit() {
		return benefit;
	}
	public int getTax() {
		return tax;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() { //toString(클래스명@16진수)가 찍히는걸 오버라이딩해서 사용하겠다
		return name+"\t"
				+ position +"\t"
				+ basePay +"\t"
				+ benefit +"\t"
				+ taxRate +"\t"
				+ salary +"\t";
	}

}
