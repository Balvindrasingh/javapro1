public class PayrollSystemTest {
   public static void main(String args[]) {
       // create subclass objects
       SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
       HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
       CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
       BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
               "444-44-4444", 5000, .04, 300);
       Pieceworker pieceworker = new Pieceworker("Jackey", "Jose", "555-55-5555", 200, 5);

       System.out.println("Employees processed individually:\n");

       System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
       System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
       System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
       System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
       System.out.printf("%s\n%s: $%,.2f\n\n", pieceworker, "earned", pieceworker.earnings());

       // create four-element Employee array
       Employee employees[] = new Employee[5];

       // initialize array with Employees
       employees[0] = salariedEmployee;
       employees[1] = hourlyEmployee;
       employees[2] = commissionEmployee;
       employees[3] = basePlusCommissionEmployee;
       employees[4] = pieceworker;

       System.out.println("Employees processed polymorphically:\n");

       // generically process each element in array employees
       for (Employee currentEmployee : employees) {
           System.out.println(currentEmployee); // invokes toString
          
       } 

      
   } 
} 