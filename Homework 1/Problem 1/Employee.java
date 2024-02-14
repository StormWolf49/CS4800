public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee(String firstName, String lastName, String SSN) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String toString() {
        return firstName + " " + lastName + ": " + SSN;
    }
}
