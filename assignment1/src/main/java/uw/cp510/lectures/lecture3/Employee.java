package uw.cp510.lectures.lecture3;

public class Employee {
    public static int employeeCount = 0;
    public String firstName;
    public String lastName;
    private String gender = "unknown";
    public double salary;
    public double bonus;
    public Employee[] friends = new Employee[20];
    private int friendCount = 0;

    static {
        System.out.println("Static block");
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addFriend(Employee friend) {
        friends[friendCount] = friend;
        friendCount++;
    }

    public int friendCount() {
        return friends.length;
    }

    public void increaseEmployeeCount() {
        employeeCount++;
    }

    public static double getEmployeeCount() {
        return employeeCount;
    }

    public String getGender() {
        return this.gender;
    }

    public Employee() {
        this.firstName = "Jesse";
        this.bonus = 0.0;
        salary = 10000;
        employeeCount++;
    }

    public Employee(String firstName, String lastName, double salary, String gender) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.bonus = 0.0;
        this.salary = salary;
    }


    public void raiseSalary() {
        salary = salary * 1.1;
        System.out.println("Raise my salary");
    }

    public void raiseSalary(double amount) {
        salary = salary + amount;
        System.out.printf("Raise my salary by %f %n", amount);
    }

    public double addBonus() {
        salary = salary * 1.1;
        System.out.printf("Bonus %f %n", salary);
        return salary;
    }

    public String toString() {
        String out = String.format("Name: %s %s%n Salary: %f %n gender: %s", firstName, lastName, salary, gender);
        return out;
    }
}
