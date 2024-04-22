package week_10;

public class Employee {
    // Base class for all types of employees

    final String firstName;
    final String lastName;
    final String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Methods specific to all employees
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", SSN: " + socialSecurityNumber;
    }

    public double earnings() {
        return 0;
    }
}
