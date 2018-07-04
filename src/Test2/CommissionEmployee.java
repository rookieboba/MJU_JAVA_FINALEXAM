package Test2;

public class CommissionEmployee extends Employee{
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee(String eINumber, String name, double CommissionRate, double GrossSales){
		super(eINumber, name);
		setCommissionRate(CommissionRate);
		setGrossSales(GrossSales);
	}
	public void setGrossSales(double GrossSales){
		grossSales = GrossSales;
	}	
	public void setCommissionRate(double CommissionRate){
		commissionRate = CommissionRate;
	}
	public double getCommissionRate(){
		return commissionRate;
	}

	public double getGrossSales(){
		return grossSales;
	}
	
	public double earnings(){
		return commissionRate * grossSales;
	}
	public String toString(){
		return "EINumber=" + super.getEINumber() +
				", name=" + super.getName() + ", commissionRate="
				+ getCommissionRate() + ", grossSales=" + getGrossSales() + ","
						+ " earnings=" + earnings();
	}
}
