package week_10;


   public class BasePlusCommissionEmployee extends CommissionEmployee {
        private double baseSalary;
    
        public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
            super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
            this.baseSalary = baseSalary;
        }
    
        public double getBaseSalary() {
            return baseSalary;
        }
    
        @Override
        public double earnings() {
            return super.earnings() + baseSalary;
        }
    
        public String toString() {
            return "Base Plus " + super.toString() + ", Base Salary: " + baseSalary;
        }
    }
    
    
    
