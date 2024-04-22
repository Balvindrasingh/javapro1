package javaaassign1;

public class EmployeeTest {
    public static void main(String[] args) 
    {
        //objects
        Employee employee1 = new Employee("terry", "sue", 9000);
        Employee employee2 = new Employee("jerry", "sue", 10000);

        System.out.println("Employee 1 yearly salary: " + employee1.getYearlySalary());
        System.out.println("Employee 2 yearly salary: " + employee2.getYearlySalary());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("Employee 1 yearly salary after 10% raise: " + employee1.getYearlySalary());
        System.out.println("Employee 2 yearly salary after 10% raise: " + employee2.getYearlySalary());
    }
}
