package case1;

public class Hourly extends Employee{
	private int hoursWorked;

	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber,
			double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		// TODO Auto-generated constructor stub
		hoursWorked = 0;
	}
	public void addHours (int moreHours) {
		hoursWorked += moreHours;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;

	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;

	}
	
	

}
