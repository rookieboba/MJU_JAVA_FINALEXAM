package Test2;


class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	
	public void setBaseSalary(double BaseSalary) {
		baseSalary = BaseSalary;
		
	}
	public double getBaseSalary(){
		return baseSalary;
	}
	
	public double earnings(){
		return (super.getCommissionRate() * super.getGrossSales()) * baseSalary;
	}
	
	public BasePlusCommissionEmployee(String eINumber, String name, double commissionRate, double grossSales, double BaseSalary){
		super(eINumber, name, commissionRate, grossSales);
		setBaseSalary(BaseSalary);
	}

	public String toString(){
		return "EINumber=" + super.getEINumber() + ", name=" + super.getName() + 
					", commissionRate=" + super.getCommissionRate() + ", grossSales=" + super.getGrossSales() 
						+ ", baseSalary=" + getBaseSalary() + ", earnings=" + earnings();
	}
}
