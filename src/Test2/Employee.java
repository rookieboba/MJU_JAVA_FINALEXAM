package Test2;




public abstract class Employee {
	private String EINumber;
	private String Name;
	
	public Employee(String eINumber, String name){
		EINumber = eINumber;
		Name = name;
	}
	
	public void setEINumber(String eINumber){
		EINumber = eINumber;
	}
	public String getEINumber(){
		return EINumber;
	}
	
	public void setName(String name){
		Name = name;
	}
	public String getName(){
		return Name;
	}
	
	public abstract double earnings();
	
	public String toString(){
		return "EINumber=" + getEINumber() + ", name=" + getName() + ", ";
	}
	
}
