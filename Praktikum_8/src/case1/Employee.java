package case1;

public class Employee extends StaffMember{
	
	protected String socialSecurityNumber; 
	protected double payRate;

	public Employee(String eName, String eAddress, String ePhone, 
			String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		// TODO Auto-generated constructor stub
		socialSecurityNumber = socSecNumber; 
		payRate	= rate;
	}
	
	
	@Override
	public String toString() {
		
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber; 
		return result;
	}


	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return payRate;
	}
}
