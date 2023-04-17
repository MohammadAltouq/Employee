/**
 * Description:Employee class with methods to set the employee name, 
 * pay rate, hours worked, and calculate the gross pay.
 */
import java.text.NumberFormat;

public class Employee {
	//Declare instance variables
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private String empName;
	private int empNumber;
	private double hoursWorked, payRate;
	//The employee default constructor. 
	//Initializes instance variables
	public Employee() {
		empName = "your name";
		empNumber = 8999;
		hoursWorked = 0;
		payRate = 0;
	}//getEmpName returns the employee’s name
	public String getEmpName() {
		return empName;
	} //getEmpNumber returns the employee’s number 
	public int getEmpNumber() {
		return empNumber;
	} //getHoursWorked returns the hours an employee worked
	public double getHoursWorked() {
		return hoursWorked;
	}//getPayRate returns the employee’s pay rate
	public double getPayRate() {
		return payRate;
	} //setEmpName sets the name for this employee
	public void setEmpName(String empName) {
		this.empName = empName;
		}//setempNumber sets the employee number for this employee
	public void setempNumber(int empNumber) {
		this.empNumber = empNumber;
	}//setHoursWorked sets the hours worked for this employee
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}//changePayRate sets the pay rate for this employee
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	} //changePayRate changes the instance variable payRate by the amount.
	public void changePayRate(double amount) {
		payRate = payRate + amount;
	}//calculateGrossPay calculates and returns the employee’s gross pay 
	public double calculateGrossPay() {
		return hoursWorked * payRate;
	}//calculate bonus with string
	public double calculateBonus(String rating) {
		if(rating.equals("excellent")) 
			return 500;
		if(rating.equals("satisfactory")) 
			return 300;
		else
			return 0;
	}//calculate bonus with integer
	public double calculateBonus(int rating) {
		if(rating == 1) 
			return 500;
		if(rating == 2) 
			return 300;
		else
			return 0;
	}//returns the current state of this employee as a String
	public String toString() {//
		return ("Employee: " + getEmpName() +
				"\tempNumber: " + getEmpNumber() + 
				"\thoursWorked: " + getHoursWorked() +
				"\tpayRate: " + fmt.format(getPayRate())+"\n");
	}
}