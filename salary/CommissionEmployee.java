package week_10;


    public class CommissionEmployee extends Employee {
        private double grossSales;
        private double commissionRate;
    
        public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
            super(firstName, lastName, socialSecurityNumber);
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
        }
    
        public double getGrossSales() {
            return grossSales;
        }
    
        public double getCommissionRate() {
            return commissionRate;
        }
    
        public double earnings() {
            return grossSales * commissionRate;
        }
    
        public String toString() {
            return "Commission " + super.toString() + ", Gross Sales: " + grossSales + ", Commission Rate: " + commissionRate;
        }
    }

