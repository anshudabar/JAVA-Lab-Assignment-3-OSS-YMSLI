package Assignment3;

public class Q1Hourly extends Q1Employee {
	private static double hourlyRate;
	private double noOfWorkingHours;
	
	public Q1Hourly(double Rate, double noOfWorkingHours) {
		hourlyRate = Rate;
		this.noOfWorkingHours = noOfWorkingHours;
	}
	
	public void setSallary(double sallary) {
		hourlyRate=sallary;
	}

	public static double getHourlyRate() {
		return hourlyRate;
	}

	public static void setHourlyRate(double Rate) {
		hourlyRate = Rate;
	}
	
	public double getSallary() {
		return (hourlyRate)*(this.noOfWorkingHours);
	}
	
	public double getPayment() {
		return this.getSallary();
	}
	
}
