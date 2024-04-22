public abstract class Employee {
    public final String firstName;
    public final String lastName;
    public final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Corrected the earnings method without the unnecessary parameter
    public abstract double earnings();
    public abstract double earnings(double data);

    public String toString() {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
