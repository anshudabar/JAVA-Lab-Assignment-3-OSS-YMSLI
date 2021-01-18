package Assignment3;
public class Q3ApplicationClass {
	public static void main(String[] args) {
        Q2Payable salariedEmployee = new Q1Salaried(16000);
        Q2Payable hourlyEmployee = new Q1Hourly(300,35);
        Q2Payable commissionEmployee = new Q1Commissioned(10,60000);
        Q2Payable invoice  = new Q2Invoice("Wheels","Alloy type wheels",4,20000);
       
        System.out.println("The Payment of Weekly salaried employee is -> " + salariedEmployee.getPayment());
        System.out.println("The Payment of Hourly salaried employee is -> " + hourlyEmployee.getPayment());
        System.out.println("The Payment of Commission based salaried employee is -> " + commissionEmployee.getPayment());
        System.out.println("The Payment of submitted Invoice is -> " + invoice.getPayment());
    }
}
