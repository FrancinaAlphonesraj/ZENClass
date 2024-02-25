package TaxCalculation;

public class Employee implements Taxable {
	
	int empID;
	String name;
	double salary;
	
	public Employee(int empID, String name, double salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	
	public double calcTax() {
		
		return salary * incomeTax;
	}
	

}
