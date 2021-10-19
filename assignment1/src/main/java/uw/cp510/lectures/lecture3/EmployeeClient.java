package uw.cp510.lectures.lecture3;

/**
 * @author Jesse Ruth
 */
public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Jesse";
        employee.lastName = "Ruth";
        employee.gender = "Male";
        employee.bonus = 800.00;
        employee.salary = 40000.00;
        System.out.println(employee.firstName + " " + employee.lastName);
    }
}
