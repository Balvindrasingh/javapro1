package week_10;

public class Main {
    public static void main(String[] args) {
        // Create instances of different types of employees
        Employee employee = new Employee("John", "Doe", "123-45-6789");
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jane", "Smith", "987-65-4321", 1000.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tom", "Johnson", "456-78-9012", 15.0, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Mary", "Brown", "789-01-2345", 50000.0, 0.1);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Michael", "Davis", "234-56-7890", 75000.0, 0.15, 3000.0);

        // Display information about each type of employee
        System.out.println(employee);
        System.out.println(salariedEmployee);
        System.out.println(hourlyEmployee);
        System.out.println(commissionEmployee);
        System.out.println(basePlusCommissionEmployee);

        // Calculate and display earnings for each employee
        System.out.println("Earnings of " + employee.getFirstName() + ": $" + employee.earnings());
        System.out.println("Earnings of " + salariedEmployee.getFirstName() + ": $" + salariedEmployee.earnings());
        System.out.println("Earnings of " + hourlyEmployee.getFirstName() + ": $" + hourlyEmployee.earnings());
        System.out.println("Earnings of " + commissionEmployee.getFirstName() + ": $" + commissionEmployee.earnings());
        System.out.println("Earnings of " + basePlusCommissionEmployee.getFirstName() + ": $" + basePlusCommissionEmployee.earnings());
}}
