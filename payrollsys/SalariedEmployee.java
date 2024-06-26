public class SalariedEmployee extends Employee {
private double weeklySalary;


public SalariedEmployee (String firstName,String lastName, String socialSecurityNumber,double weeklySalary) {

super(firstName,lastName,socialSecurityNumber);

if (weeklySalary < 0.0)

throw new IllegalArgumentException("Weekly salary must be >= 0.0");

this.weeklySalary = weeklySalary;

}

public void setWeeklySalary(double weeklySalary) {

if (weeklySalary < 0.0)

throw new IllegalArgumentException("Weekly salary must be >= 0.0");

this.weeklySalary = weeklySalary;

}


public double getWeeklySalary() {

return weeklySalary;

}


public double earnings() {
    return getWeeklySalary() -500;
}


public String toString() {

return String.format("Salaried employee : %s%n%s : $%,.2f,", super.toString(),"Weekly salary",getWeeklySalary());

}

@Override
public double earnings(double data) {
    throw new UnsupportedOperationException("Unimplemented method 'earnings'");
}


}