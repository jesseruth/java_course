package uw.cp510.lectures.lecture3;

import javax.swing.*;

/**
 * @author Jesse Ruth
 */
public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "Jesse";
        employee.lastName = "Ruth";
        employee.setGender("Male");
        employee.bonus = 800.00;
        employee.salary = 40000.00;
        System.out.println(employee.firstName + " " + employee.lastName);
        employee.raiseSalary();
        employee.raiseSalary(800.00);
        employee.addBonus();

        Employee employee2 = new Employee();
        employee2.firstName = "Jim";
        employee2.lastName = "Bob";
        employee2.setGender("Male");
        employee2.bonus = 80.00;
        employee2.salary = 400.00;
        System.out.println(employee2.firstName + " " + employee2.lastName);
        employee2.raiseSalary();
        employee2.raiseSalary(80.00);
        double bonusSalary = employee2.addBonus();
        System.out.println(employee2.toString());
        System.out.println(employee.toString());

        Employee employee3 = new Employee();
        employee3.increaseEmployeeCount();
        employee.increaseEmployeeCount();
        System.out.println(employee3.toString());
        Employee employee4 = new Employee("dumb", "guy", 4040.04, "Malet");
        System.out.println(employee4.toString());
        System.out.println(Employee.employeeCount);
        employee4.addFriend(employee);
        employee4.addFriend(employee2);
        System.out.println(employee4.friendCount() + " Friends ");
        JOptionPane.showInputDialog("Hello");
    }
}
