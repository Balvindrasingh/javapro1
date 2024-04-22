package week_10;


public class SalariedEmployee extends Employee {
        private double weeklySalary;
    
        
        public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
            super(firstName, lastName, socialSecurityNumber);
            this.weeklySalary = weeklySalary;
            if (weeklySalary<0.0){
                throw new IllegalArgumentException("Weekly salary must  be >0.0");}
        }
    
        public double getWeeklySalary() {
            return weeklySalary;
        }
    @Override
        public double earnings() {
            return getWeeklySalary() - 500;
        }
    
        public String toString() {
            return String.format("Salaried Employee: %s%n%s: $%, .2f, ",super.toString(),"weekly salary",getWeeklySalary());
        }
    }
    

