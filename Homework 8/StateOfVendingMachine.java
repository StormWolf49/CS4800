interface StateOfVendingMachine {
    void selectSnack(String snackName, VendingMachine vendingMachine);
    void insertMoney(double money, VendingMachine vendingMachine);
    void dispenseSnack(VendingMachine vendingMachine);
}