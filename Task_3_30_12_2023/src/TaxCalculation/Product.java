package TaxCalculation;

public class Product implements Taxable {
	int pid;
	double price;
	int quantity;
	
	
	
	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
		
		
	}


	public double calcTax() {
		System.out.println(salesTax);
		return price * quantity * salesTax;
		
		
		
	}
	
	
	
	

}
