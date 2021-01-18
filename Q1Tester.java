package Assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q1Tester {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please specify the type of employee you want to create: ");
		System.out.println("1. Weekly Salaried Employee");
		System.out.println("2. Hourly Salaried Employee");
		System.out.println("3. Commission based Salaried Employee");
		System.out.println("4. Exit");
		int userInput = Integer.parseInt(obj.readLine());
	
		while(true) {
				if(userInput == 1) {
					System.out.println("Please enter the weekly sallary rate: ");
					double weeklyRate = Double.parseDouble(obj.readLine());
					Q1Employee employee = new Q1Salaried(weeklyRate);
					System.out.println("Please choose from following operations: ");
					System.out.println("1. Display employee Sallary");
					System.out.println("2. Increase employee Sallary");
					int response = Integer.parseInt(obj.readLine());
					if(response == 1)
						System.out.println("Input employee's sallary is: "+employee.getSallary());
					else {
						System.out.println("How much do you want to increase sallary rate in percentage? ");
						double input = Double.parseDouble(obj.readLine());
						double newSallaryRate = Q1Salaried.getWeeklyRate() + (Q1Salaried.getWeeklyRate()*input)/100;
						Q1Salaried.setWeeklyRate(newSallaryRate);
						System.out.println("Input employee's new sallary is: "+employee.getSallary());
						
					}
				}
				
				else if(userInput == 2) {
					System.out.println("Please enter the hourly sallary rate: ");
					double hourlyRate = Double.parseDouble(obj.readLine());
					System.out.println("Please enter then number of working hours");
					double workingHours = Double.parseDouble(obj.readLine());
					Q1Employee employee = new Q1Hourly(hourlyRate,workingHours);
					System.out.println("Please choose from following operations: ");
					System.out.println("1. Display employee Sallary");
					System.out.println("2. Increase employee Sallary");					
					int response = Integer.parseInt(obj.readLine());
					if(response == 1)
						System.out.println("Input employee's sallary is: "+employee.getSallary());
					else {
						System.out.println("How much do you want to increase sallary rate in percentage? ");
						double input = Double.parseDouble(obj.readLine());
						double newSallaryRate = Q1Hourly.getHourlyRate() + (Q1Hourly.getHourlyRate()*input)/100;
						Q1Hourly.setHourlyRate(newSallaryRate);
						System.out.println("Input employee's new sallary is: "+employee.getSallary());
						
					}
				}
				
				else if(userInput == 3) {
					System.out.println("Please enter the total weekly sales: ");
					double weeklysales = Double.parseDouble(obj.readLine());
					System.out.println("Please enter the employee's sales contribution in percentage: ");
					double percentage = Double.parseDouble(obj.readLine());
					Q1Employee employee = new Q1Commissioned(percentage,weeklysales);
					System.out.println("Please choose from following operations: ");
					System.out.println("1. Display employee Sallary");
					System.out.println("2. Increase employee Sallary");					
					int response = Integer.parseInt(obj.readLine());
					if(response == 1)
						System.out.println("Input employee's sallary is: "+employee.getSallary());
					else {
						System.out.println("How much do you want to increase employee's contribution in percentage? ");
						double input = Double.parseDouble(obj.readLine());
						double newSallaryRate = Q1Commissioned.getPercentageSale() + (Q1Commissioned.getPercentageSale()*input)/100;
						Q1Commissioned.setPercentageSale(newSallaryRate);
						System.out.println("Input employee's sallary is: "+employee.getSallary());
					}
				}
				
				
				else if(userInput == 4) {
					System.out.println("Thankyou for using YMSLI employee portal: ");
					
				}
				
				else {
					System.out.println("Please enter a valid input");
				}
		}
		
		
	}
}

