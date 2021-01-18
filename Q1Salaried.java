package Assignment3;

public class Q1Salaried extends Q1Employee {
	private static double weeklyRate;
	
	
	public Q1Salaried(double Rate) {
		weeklyRate = Rate;
	}

	public void setSallary(double sallary) {
		weeklyRate = sallary;
	}
	
	public static double getWeeklyRate() {
		return weeklyRate;
	}

	public static void setWeeklyRate(double weeklyR) {
		weeklyRate = weeklyR;
	}
	
	public double getSallary() {
		return weeklyRate;
	}
	
	public double getPayment() {
		return this.getSallary();
	}
	
}
