/**
EmployeeTester class used to manage the employee profile form Employee.java 
*/
import java.text.NumberFormat;
public class EmployeeTester {
	public static void main(String[] args) {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.println("Welcome to our EmployeeTester");
		Employee worker1 = new Employee();
		System.out.println("Beginning state of worker1:\n" + worker1);
		worker1.setPayRate(20);
		System.out.println("After pay rate is set:\n" + worker1);
		worker1.setHoursWorked(30);
		worker1.changePayRate(4.50);
		System.out.println("After the pay rate and hours worked increase:\n" + worker1);
		System.out.println("Employee: " + worker1.getEmpName() + " earned " + fmt.format(worker1.calculateGrossPay()));
		System.out.println("After bonus:" + worker1.getEmpName() + " received a bonus of " + fmt.format(worker1.calculateBonus("excellent"))+
							" and earned a total of " + (fmt.format(worker1.calculateGrossPay() + worker1.calculateBonus("excellent"))));
	}	
}

