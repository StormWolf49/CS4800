public class CruiseShip extends Ship {
    private int passengers;

    public CruiseShip(String name, String year, int passengers) {
        super(name, year);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void print() {
        System.out.println(getName() + " with a max number of passengers of " + passengers + " and built in " + getYear());
    }
}
