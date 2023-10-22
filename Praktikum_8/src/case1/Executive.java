package case1;

public class Executive extends Employee{
	private double bonus;
	

	public Executive(String eName, String eAddress, String ePhone, 
			String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		// TODO Auto-generated constructor stub
		bonus = 0;
	}

	@Override
	public double pay() {
		double payment = super.pay() + bonus; 
		bonus = 0;
		return payment;

	}
	
	public void awardBonus (double execBonus) {
		bonus =+ execBonus;
	}

}
