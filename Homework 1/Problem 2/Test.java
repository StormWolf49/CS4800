public class Test {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Ship1", "1998");
        ships[1] = new CruiseShip("Ship2", "2001", 36);
        ships[2] = new CargoShip("Ship3", "2010", 300);
        for (int i = 0; i < 3; i++) {
            ships[i].print();
        }
    }
}
