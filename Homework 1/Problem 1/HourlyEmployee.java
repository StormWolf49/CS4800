public class HourlyEmployee extends Employee {
    private double wage;
    private int hours;
    
    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, int hours) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + " ($" + wage + " & " + hours + " hrs)";
    }
}
