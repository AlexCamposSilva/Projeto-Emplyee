package Entities;

public class OutsoucerdEmployee extends Employee {
	
	private double additionalCharge;
	
	
	public OutsoucerdEmployee (){
		super();
	}


	public OutsoucerdEmployee(String name, int hours, double valuePerHour,
			double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	
	
	public OutsoucerdEmployee(String name, double hours, double valuePerHour,
			double additionalCharge2) {
		this.additionalCharge = additionalCharge;

		// TODO Auto-generated constructor stub
	}


	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
	
	

}
