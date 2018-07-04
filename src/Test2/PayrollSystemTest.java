package Test2;


public class PayrollSystemTest {
	public static void main(String[] args){
		
		Employee employees[] = new Employee[4];

		
		CommissionEmployee commissionEmployee1 = new CommissionEmployee("001", "È«±æµ¿", 0.06, 10000.0);
		CommissionEmployee commissionEmployee2 = new CommissionEmployee("002", "°í±æµ¿", 0.08, 12000.0);
		BasePlusCommissionEmployee basePlusCommissionEmployee1 = new BasePlusCommissionEmployee("003", "±èÃ¶¼ö", 0.04, 5000.0, 300.0);
		BasePlusCommissionEmployee basePlusCommissionEmployee2 = new BasePlusCommissionEmployee("004", "ÀÌÃ¶¼ö", 0.03, 6000.0, 400.0);
	
		employees[0] = commissionEmployee1;
		employees[1] = commissionEmployee2;
		employees[2] = basePlusCommissionEmployee1;
		employees[3] = basePlusCommissionEmployee2;
		
		employees[0].earnings();
		employees[1].earnings();
		employees[2].earnings();
		employees[3].earnings();
		
		System.out.println(employees[0].toString());
		System.out.println(employees[1].toString());
		System.out.println(employees[2].toString());
		System.out.println(employees[3].toString());
		
		
	}
}

