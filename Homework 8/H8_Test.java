public class H8_Test {
    public static void main(String[] args) {
        // Create snacks
        Snack coke = new Snack("Coke", 1.5, 5);
        Snack pepsi = new Snack("Pepsi", 1.3, 10);
        Snack cheetos = new Snack("Cheetos", 1.0, 8);
        Snack doritos = new Snack("Doritos", 1.2, 6);
        Snack kitkat = new Snack("KitKat", 1.4, 4);
        Snack snickers = new Snack("Snickers", 1.1, 1);

        // Create vending machine
        SnackDispenseHandler snacks = new SnackDispenseHandler(coke, new SnackDispenseHandler(pepsi, new SnackDispenseHandler(cheetos, new SnackDispenseHandler(doritos, new SnackDispenseHandler(kitkat, new SnackDispenseHandler(snickers, null))))));
        VendingMachine vendingMachine = new VendingMachine(snacks);

        // Select snack and insert money
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2.0);
        vendingMachine.dispenseSnack(); // Should dispense Coke

        // Select snack with insufficient money
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(1.0);
        vendingMachine.dispenseSnack(); // Should return money

        // Select snack and insert money
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.1);
        vendingMachine.dispenseSnack(); // Should dispense Snickers

        // Select out of stock snack
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.1);
        vendingMachine.dispenseSnack(); // Should return money
    }
}