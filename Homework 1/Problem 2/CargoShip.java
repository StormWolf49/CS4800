public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip(String name, String year, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void print() {
        System.out.println(getName() + " with a max capacity of " + tonnage + " and built in " + getYear());
    }
}
