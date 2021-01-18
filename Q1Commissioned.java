package Assignment3;

public class Q1Commissioned extends Q1Employee {
	private static double percentageSale;
	private double weeklySale;
	
	public Q1Commissioned(double Sale, double weeklySale) {
		percentageSale = Sale;
		this.weeklySale = weeklySale;
	}
	public static double getPercentageSale() {
		return percentageSale;
	}
	public void setSallary(double sallary) {
		percentageSale=sallary;
	}
	
	public static void setPercentageSale(double Sale) {
		percentageSale = Sale;
	}
	public double getWeeklySale() {
		return weeklySale;
	}
	public void setWeeklySale(double weeklySale) {
		this.weeklySale = weeklySale;
	}
	
	public double getSallary() {
		return ((this.weeklySale)*(percentageSale))/100;
	}
	
	public double getPayment() {
		return this.getSallary();
	}
	
}
