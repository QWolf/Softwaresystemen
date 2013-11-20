package ss.week1;

public class Employee {
	private int hours = 45;
	private double rate = 10;
	
	public double getPayment() {
		if (hours > 40) {
			return (40 * rate + ((hours - 40) * rate /2));
			
		}
		else return rate * hours;
	}
	public static void main(String [] args) {
		Employee Steve = new Employee();
		System.out.println(Steve.getPayment());
	}
}
