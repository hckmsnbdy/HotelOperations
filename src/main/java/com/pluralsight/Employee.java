package com.pluralsight;
import java.time.LocalTime;
// Truncate to seconds, effectively removing nanoseconds/milliseconds
//import java.time.temporal.ChronoUnit;
//LocalTime timeWithoutMillis = currentTime.truncatedTo(ChronoUnit.SECONDS);
/**
 * Employee
 * The Employee class is used to store and calculate payroll information about and
 * employee. It should manage the following information using private variables:
 * employeeId, name, department, payRate, hoursWorked.
 * Include the following derived getters (you may also include others as necessary):
 * getTotalPay
 * getRegularHours
 * getOvertimeHours
 */

/**
 * Modify the Employee class to add a punchIn and punchOut methods. Each
 * time the employee punches in, we track their start time.
 * When they punch out, we calculate how many hours they have worked and add
 * that time to their hours worked.
 * To keep the math simple for now, each function will take a double as an input
 * argument.
 * punchIn(double time)
 * punchOut(double time)
 * 37
 * Example
 * input variables for time
 * 10:00 am => 10.0
 * 12:30 pm => 12.5
 * 2:45 pm => 14.75
 */
public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked, punchIn, punchOut;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked,double punchIn, double punchOut) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchIn = punchIn;
        this.punchOut = punchOut;
    }
    public double getHoursWorked(){
        return this.punchOut - this.punchIn;
    }
    public double punchIn(){
        return punchIn;
    }
    public double punchOut(){
        if (punchIn != 0);
        return punchOut;
    }

    public String getDepartment() {
        return department;
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();

        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();

        return regularPay + overtimePay;
    }

    //Will return 40 or less, based on their hours worked
    public double getRegularHours() {
        if (this.getHoursWorked()*5 <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    //Will hours worked over 40
    public double getOvertimeHours() {
        if (this.getHoursWorked()*5 > 40) {
            return this.getHoursWorked() - 40;
        } else {
            return 0;
        }
    }

}